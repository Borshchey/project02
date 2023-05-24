package project02;

public class Game {

    public Paragraph CurrentParagraph;
    private boolean sessionActive = false;
    private boolean gameActive = true;
    private Menu menu = new Menu();


    public void finishGame() {
        CurrentParagraph = null;
    }

    public void startNewGame() {
        CurrentParagraph = ParagraphsData.getParagraphByName("Лисенок");
        System.out.println(CurrentParagraph);
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
        System.out.println(CurrentParagraph);
    }

    public void chooseSecondOption() {
        CurrentParagraph = CurrentParagraph.chooseSecondOption();
        System.out.println(CurrentParagraph);
    }

    public void exitSession() {
        sessionActive = false;
    }
}
