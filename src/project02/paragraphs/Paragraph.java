package project02.paragraphs;

import java.io.Serializable;

abstract public class Paragraph implements Serializable {
    public String name;
    public String text;
    public Paragraph firstOption;
    public Paragraph secondOption;

    public abstract void createOptions();
    public Paragraph chooseFirstOption(){return firstOption;}
    public Paragraph chooseSecondOption(){return secondOption;}

    @Override
    public String toString() {
        return text;
    }
}