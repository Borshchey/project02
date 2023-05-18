package project02.commands;


import project02.Game;

public class ExitSession implements ICommand {
    Game game;

    public ExitSession(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.exitSession();
    }
}