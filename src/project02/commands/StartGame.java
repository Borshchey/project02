package project02.commands;


import project02.Game;

public class StartGame implements ICommand {
    private Game game;

    public StartGame(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.startNewGame();
    }
}
