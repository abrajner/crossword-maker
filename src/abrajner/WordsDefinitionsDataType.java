package abrajner;

import java.util.List;
import java.util.Map;

public class WordsDefinitionsDataType {
    private Integer id;
    private String word;
    private String definition;
    private String direction;
    private List<LetterDataType> enteredLetters;

    public WordsDefinitionsDataType(Integer id, String word, String definition, String direction, Integer xCoordinate, Integer yCoordinate){
        setId(id);
        setWord(word);
        setDefinition(definition);
        setDirection(direction);
        setEnteredLetters(xCoordinate, yCoordinate, word);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public List<LetterDataType> getEnteredLetters() {
        return enteredLetters;
    }

    private void setEnteredLetters(Integer xCoordinate, Integer yCoordinate, String word) {

    }

}