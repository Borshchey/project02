package project02.commands;


import project02.Game;

public class ExitGame implements ICommand {
    Game game;

    public ExitGame(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.exitGame();
    }
}