package project02.paragraphs;

public class GottaTakeTheChanceAndGetSomeHoney extends Paragraph {
        public GottaTakeTheChanceAndGetSomeHoney() {
            name = "Нужно воспользоваться шансом и раздобыть мёд";
            text = "Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. \n" +
                    "Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.";
        }
        @Override
        public void createOptions() {
            firstOption = new WaitSuddenlyTheBeesWillFlyAway();
            secondOption = new ShouldTryToStealTheHoneyImmediately();
        }
    }