package abrajner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrosswordPrinterTest {

    @Test
    public void testFillWithEmptySpaces(){
        CrosswordPrinter crosswordPrinter = new CrosswordPrinter();

        String [][] arrayWithEmptySpaces = crosswordPrinter.createAndFillArrayWithEptySpaces(4,5);

        String [][] assertedArray = {{" ", " ", " ", " ", " "}, {" ", " ", " ", " ", " "}, {" ", " ", " ", " ", " "}, {" ", " ", " ", " ", " "}};
        assertArrayEquals(assertedArray, arrayWithEmptySpaces);
    }

}