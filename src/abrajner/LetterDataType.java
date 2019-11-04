package abrajner;

import java.util.Objects;

public class LetterDataType {
    private Character letter;
    private Integer xCoordinate;
    private Integer yCoordinate;

    public LetterDataType(Integer xCoordinate, Integer yCoordinate, Character letter){
        this.letter = letter;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Integer getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(Integer yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Integer getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(Integer xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public Character getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LetterDataType that = (LetterDataType) o;
        return Objects.equals(letter, that.letter) &&
                Objects.equals(xCoordinate, that.xCoordinate) &&
                Objects.equals(yCoordinate, that.yCoordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter, xCoordinate, yCoordinate);
    }
}
