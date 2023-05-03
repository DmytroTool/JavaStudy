import org.example.QuadraticEquation;
import org.example.QuadraticEquationSolver;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEquationSolverTest {
    @Test
    public void testTwoRoots() {
        double a = 1;
        double b = -3;
        double c = 2;
        double[] expectedRoots = new double[]{2.0,1.0};

        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        double [] actualRoots = qe.getRoot();

        assertEquals(2,actualRoots.length);
        assertArrayEquals(expectedRoots,actualRoots);

    }

    @Test
    public void testOneRoot() {
        double a = 1;
        double b = -2;
        double c = 1;
        double[] expectedRoots = new double[]{1.0};


        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        double [] actualRoots = qe.getRoot();

        assertEquals(1,actualRoots.length);
        assertArrayEquals(expectedRoots,actualRoots);

    }

    @Test
    public void testNoRoots() {
        double a = 1;
        double b = 2;
        double c = 3;
        double[] expectedRoots = new double[]{};


        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        double [] actualRoots = qe.getRoot();

        assertEquals(0,actualRoots.length);
        assertArrayEquals(expectedRoots,actualRoots);
    }


    }
}

