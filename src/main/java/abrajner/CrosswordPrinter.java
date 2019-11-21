package abrajner;

import java.util.ArrayList;
import java.util.List;

public class CrosswordPrinter {
    private Integer crosswordHeight;
    private Integer crosswordWidth;

    public Integer getCrosswordHeight() {
        return crosswordHeight;
    }

    public void setCrosswordHeight(Integer crosswordHeight) {
        this.crosswordHeight = crosswordHeight;
    }

    public Integer getCrosswordWidth() {
        return crosswordWidth;
    }

    public void setCrosswordWidth(Integer crosswordWidth) {
        this.crosswordWidth = crosswordWidth;
    }


    public   String[][] createAndFillArrayWithEptySpaces(Integer height, Integer width){
        String[][] array = new String[height][width];
        this.crosswordHeight = height;
        this.crosswordWidth = width;
        for (int i = 0; i < crosswordHeight; i++) {
            for (int j = 0; j < crosswordWidth; j++){
                array[i][j] = " ";
            }
        }
        return array;
    }

    public void printArray(String [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[j][i]);
            }
            System.out.println();
        }
    }
    public void printResultInConsole(ArrayList<WordsDefinitionsDataType> items) {
        String[][] result = createAndFillArrayWithEptySpaces(this.crosswordHeight, this.crosswordWidth);
        for (WordsDefinitionsDataType i : items) {
            i.getEnteredLetters().forEach((temp) -> {
                if(temp.getLetter() == null){
                    result[temp.getxCoordinate()-1][temp.getyCoordinate()-1] = "_";
                }
                else {
                    result[temp.getxCoordinate() - 1][temp.getyCoordinate() - 1] = String.valueOf(temp.getLetter());
                }
            });
        }
        printArray(result);
    }

    public static void main(String[] args) {
        WordsDefinitionsDataType test1 = new WordsDefinitionsDataType(1, "Ala", "definicja", "vertical", 3, 1);
        WordsDefinitionsDataType test2 = new WordsDefinitionsDataType(2, "trolololo", "definicja", "horizontal", 1, 5);
        WordsDefinitionsDataType test3 = new WordsDefinitionsDataType(3, "elo", "definicja", "vertical", 7, 3);

        ArrayList<WordsDefinitionsDataType> test = new ArrayList<WordsDefinitionsDataType>();

        test.add(test1);
        test.add(test2);
        test.add(test3);

        CrosswordPrinter testPrinter = new CrosswordPrinter();
        testPrinter.printResultInConsole(test);
    }
}