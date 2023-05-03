package HomeJob_14;

import com.google.common.util.concurrent.FluentFuture;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;


public class HillelPageCoachesList {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));

        driver.manage().window().maximize();

        driver.get("https://ithillel.ua/");

        WebElement programmingCourse = driver.findElement(By.cssSelector(".course-cat-bar_icon[alt ='Програмування']"));
        programmingCourse.click();

        WebElement frontEndBasic = driver.findElement(By.cssSelector("a.block-profession_link[href*='front-end-basic']"));

        frontEndBasic.click();

        Wait<WebDriver> wait = new FluentWait<>(driver)

                .pollingEvery(Duration.ofMillis(30))
                .withTimeout(Duration.ofSeconds(7))
                .ignoring(NoSuchElementException.class);

        ((JavascriptExecutor)driver).executeScript("window.scrollTo"+
                driver.findElement(By.cssSelector(".-profession")).getLocation());

        WebElement coachList =   wait.until(d -> {
            return driver.findElement(By.cssSelector(".coach-list"));
                });

        List<WebElement> coachListItems = coachList.findElements(By.cssSelector(".coach-list_item"));
        WebElement coachesShowAllButton = driver.findElement(By.id("coachesShowAllButton"));

        wait.until(d -> {
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,100)");
            return coachesShowAllButton.isEnabled();
        });
        coachesShowAllButton.click();

        List<String> coachesName = coachListItems.stream()
                .map(we -> we.findElement(By.cssSelector(".coach-card_name")))
                .map(WebElement::getText)
                .collect(Collectors.toList());
        System.out.print(coachesName);






    }
}
