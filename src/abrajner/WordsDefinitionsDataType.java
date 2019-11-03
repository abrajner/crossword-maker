package abrajner;

import java.util.Map;

public class WordsDefinitionsDataType {
    private Integer id;
    private String word;
    private String definition;
    private Integer xCoordinate;
    private Integer yCoordinate;
    private String direction;
    private Map<Integer, Character> enteredLetters;

    public String getWord() {
        return word;
    }

    public Integer getId() {
        return id;
    }

    public Integer getxCoordinate() {
        return xCoordinate;
    }

    public Integer getyCoordinate() {
        return yCoordinate;
    }

    public String getDirection() {
        return direction;
    }

    public Map<Integer, Character> getEnteredLetters() {
        return enteredLetters;
    }

    public String getDefinition() {
        return definition;
    }
}