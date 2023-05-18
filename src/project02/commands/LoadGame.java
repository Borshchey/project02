package project02.commands;


import project02.Game;

public class LoadGame implements ICommand {
    Game game;

    public LoadGame(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.loadGame();
    }
}