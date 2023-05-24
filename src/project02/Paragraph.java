package project02;

import java.io.Serializable;
 public class Paragraph implements Serializable {
    public String name;
    public String text;
    public Paragraph firstOption;
    public Paragraph secondOption;

    public Paragraph(String name, String text) {
        this.name = name;
        this.text = text;
    }

     public String getName() {return name;}

     public void setFirstOption(Paragraph firstOption) {
        this.firstOption = firstOption;
    }

    public void setSecondOption(Paragraph secondOption) {
        this.secondOption = secondOption;
    }

    public Paragraph chooseFirstOption(){return firstOption;}
    public Paragraph chooseSecondOption(){return secondOption;}

    @Override
    public String toString() {
        return text;
    }
}