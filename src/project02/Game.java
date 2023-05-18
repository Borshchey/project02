package project02;

import project02.paragraphs.Fox;
import project02.paragraphs.Paragraph;

public class Game {

    public Paragraph CurrentParagraph;
    private boolean sessionActive = false;
    private boolean gameActive = true;
    private Menu menu = new Menu();


    public void finishGame() {
        CurrentParagraph = null;
    }

    public void startNewGame() {
        CurrentParagraph = new Fox();
        System.out.println(CurrentParagraph);
        CurrentParagraph.createOptions();
        sessionActive = true;
        Menu menu = new Menu();
        menu.startGameMenu(this);
    }

    public boolean isStarted() {
        return CurrentParagraph != null;
    }


    public void startGame() {
        menu.startMenu(this);
    }

    public void exitGame() {
        System.out.println("Игра завершена");
        gameActive = false;
    }

    public void saveGame() {
        BinHandler<Paragraph> paragraphSave = new BinHandler<>();
        paragraphSave.writeToFile(CurrentParagraph);
        System.out.println("Игра сохранена");
    }

    public void loadGame() {
        BinHandler<Paragraph> paragraphLoad = new BinHandler<>();
        CurrentParagraph = paragraphLoad.readFromFile();
        sessionActive = true;
        System.out.println("Игра загружена");
        menu.startMenu(this);
    }

    public void continueGame() {
        System.out.println(CurrentParagraph);
        CurrentParagraph.createOptions();
        sessionActive = true;
        menu.startGameMenu(this);
    }

    public boolean isSessionActive() {
        return sessionActive;
    }

    public boolean isGameActive() {
        return gameActive;
    }

    public void chooseFisrtOption() {
        CurrentParagraph = CurrentParagraph.chooseFirstOption();
        CurrentParagraph.createOptions();
        System.out.println(CurrentParagraph);
    }

    public void chooseSecondOption() {
        CurrentParagraph = CurrentParagraph.chooseSecondOption();
        CurrentParagraph.createOptions();
        System.out.println(CurrentParagraph);
    }

    public void exitSession() {
        sessionActive = false;
    }
}
