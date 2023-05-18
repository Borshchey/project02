package project02.commands;


import project02.Game;

public class ChooseFirstOption implements ICommand {
        Game game;

        public ChooseFirstOption(Game game) {
            this.game = game;
        }

        @Override
        public void execute() {
            game.chooseFisrtOption();
        }
}