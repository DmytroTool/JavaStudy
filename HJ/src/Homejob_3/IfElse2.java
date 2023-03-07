package Homejob_3;

import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input product amount");

        int price = Integer.parseInt(args[0]);
        int productQuantity = sc.nextInt();
        double allProductsCoast  = price*productQuantity; //no discount products sum price
        double discountPrice1 =  (allProductsCoast - ((allProductsCoast / 100) * 5)); /*discount 5%*/
        double discountPrice2 =  (allProductsCoast - ((allProductsCoast / 100) * 10)); /*discount 10%*/
        double discountPrice3 =  (allProductsCoast - ((allProductsCoast / 100) * 12)); /*discount 12%*/
        double discountPrice4 =  (allProductsCoast - ((allProductsCoast / 100) * 13)); /*discount 13%*/
        double additionalDiscount1 =  (allProductsCoast - ((allProductsCoast / 100) * (12.4))); /*discount 12.4%*/
        double additionalDiscount2 =  (allProductsCoast - ((allProductsCoast / 100) * (12.8))); /*discount 12.8%*/
        double additionalDiscount3 = (allProductsCoast - ((allProductsCoast / 100) * (13.2))); /*discount 13.2%*/
        double additionalDiscount4 = (allProductsCoast - ((allProductsCoast / 100) * (13.6))); /*discount 13.6%*/



        if ((productQuantity > 10 && productQuantity < 21 )) {
            allProductsCoast = discountPrice1;
        }

        if ((productQuantity > 20 && productQuantity < 31 )) {
            allProductsCoast = discountPrice2;
        }
        if ((productQuantity > 30 && productQuantity < 41 )) {
            allProductsCoast = discountPrice3;
        }
        if (productQuantity > 80) {
            allProductsCoast = discountPrice4;
        }

        if ((productQuantity > 40 && productQuantity < 51 )) {
            allProductsCoast  = additionalDiscount1;
        }

        if ((productQuantity > 50 && productQuantity < 61 )) {
            allProductsCoast  = additionalDiscount2;
        }
        if ((productQuantity > 60 && productQuantity < 71 )) {
            allProductsCoast  = additionalDiscount3;
        }
        if ((productQuantity > 70 && productQuantity < 81 )) {
            allProductsCoast  = additionalDiscount4;
        }
        System.out.println("Price of all goods are : " + allProductsCoast );

    }
}
