package project02.commands;

import project02.Game;

public class ContinueGame implements ICommand {
    private Game game;

    public ContinueGame(Game game) {
        this.game = game;
    }

    @Override
    public void execute() { game.continueGame(); }
}