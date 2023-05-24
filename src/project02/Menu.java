package project02;

import project02.commands.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    private Map<String, ICommand> commandMap = new HashMap<String, ICommand>();

    public void updateCommands(Map<String, ICommand> commandMap) {
        this.commandMap = commandMap;
    }

    public Map<String, ICommand> mainMenuCommands(Game game) {
        Map<String, ICommand> commandMap = new HashMap<String, ICommand>();
        int i = 0;

        ICommand startGame = new StartGame(game);
        commandMap.put(++i + " Начать новую игру ", startGame);

        if (game.isStarted()) {
            ICommand continueGame = new ContinueGame(game);
            commandMap.put(++i + " Продолжить игру ", continueGame);
            ICommand saveGame = new SaveGame(game);
            commandMap.put(++i + " Сохранить игру ", saveGame);
        }

        ICommand loadGame = new LoadGame(game);
        commandMap.put(++i + " Загрузить игру ", loadGame);
        ICommand exitGame = new ExitGame(game);
        commandMap.put(++i + " Выход ", exitGame);
        return commandMap;
    }

    public Map<String, ICommand> gameMenuCommands(Game game) {
        Map<String, ICommand> commandMap = new HashMap<String, ICommand>();
        int i = 0;
        if (!(game.CurrentParagraph.firstOption == null) && !(game.CurrentParagraph.secondOption == null)) {
            ICommand chooseFirstOption = new ChooseFirstOption(game);
            commandMap.put(++i + " " + game.CurrentParagraph.firstOption.name + " ", chooseFirstOption);
            ICommand chooseSecondOption = new ChooseSecondOption(game);
            commandMap.put( ++i + " " + game.CurrentParagraph.secondOption.name + " ", chooseSecondOption);
        }
        else {
            game.finishGame();
        }
            ICommand exitSession = new ExitSession(game);
            commandMap.put(++i +" Выйти в меню ", exitSession);
        return commandMap;
    }

    public void printMenu() {
        for (int i = 0; i < commandMap.size(); i++) {
            for (String str : commandMap.keySet()) {
                if (str.contains((i + 1) + " ")) System.out.println(str);
            }
        }
    }

    public void checkAnswer(Scanner scanner) {
        String answer = scanner.nextLine();
        for (String str : commandMap.keySet()) {
            if (str.contains(answer + " ")) {
                commandMap.get(str).execute();
                break;
            }
        }
    }

    public void startMenu(Game game) {
        Scanner scanner = new Scanner(System.in);
        while (game.isGameActive()) {
            updateCommands(mainMenuCommands(game));
            printMenu();
            checkAnswer(scanner);
        }
    }

    public void startGameMenu(Game game) {
        Scanner scanner = new Scanner(System.in);
        while (game.isSessionActive()) {
            updateCommands(gameMenuCommands(game));
            printMenu();
            checkAnswer(scanner);
        }
    }
}