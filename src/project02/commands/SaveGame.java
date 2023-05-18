package project02.commands;


import project02.Game;

public class SaveGame implements ICommand {
    Game game;

    public SaveGame(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.saveGame();
    }
}