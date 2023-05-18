package project02.commands;


import project02.Game;

public class ChooseSecondOption implements ICommand {
    Game game;

    public ChooseSecondOption(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.chooseSecondOption();
    }
}