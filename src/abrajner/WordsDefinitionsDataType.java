package abrajner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WordsDefinitionsDataType {
    private Integer id;
    private String word;
    private String definition;
    private String direction;
    private List<LetterDataType> enteredLetters = new ArrayList<LetterDataType>();

    public WordsDefinitionsDataType(Integer id, String word, String definition, String direction, Integer xCoordinate, Integer yCoordinate) {
        this.id = id;
        this.word = word;
        this.direction = direction;

        setId(id);
        setWord(word);
        setDefinition(definition);
        setDirection(direction);
        setInitialEnteredLetters(xCoordinate, yCoordinate);
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

    private void setInitialEnteredLetters(Integer xCoordinate, Integer yCoordinate) {
        char[] wordCharArray = this.word.toCharArray();
        Integer temp = 0;
        if(this.direction.equals("horizontal")){
            for(char i: wordCharArray){
                LetterDataType letter = new LetterDataType(xCoordinate+temp, yCoordinate, null);
                temp += 1;
                this.enteredLetters.add(letter);
            }
        }
        else if(this.direction.equals("vertical")){
            for(char i: wordCharArray){
                LetterDataType letter = new LetterDataType(xCoordinate, yCoordinate+temp, null);
                temp += 1;
                this.enteredLetters.add(letter);
            }
        }
        else{
            System.out.println("Something is wrong");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordsDefinitionsDataType that = (WordsDefinitionsDataType) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(word, that.word) &&
                Objects.equals(definition, that.definition) &&
                Objects.equals(direction, that.direction) &&
                Objects.equals(enteredLetters, that.enteredLetters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, word, definition, direction, enteredLetters);
    }
}