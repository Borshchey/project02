package project02.paragraphs;

public class WaitSuddenlyTheBeesWillFlyAway extends Paragraph {
        public WaitSuddenlyTheBeesWillFlyAway() {
            name = "Подождать, вдруг пчёлы улетят";
            text = "Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда. \n" +
                    "Вдруг он понял, что очень голоден. Что же делать?";
        }
        @Override
        public void createOptions() {
            firstOption = new EatALittleAndRest();
            secondOption = new RatherTakeTheHoneyToTheBear();
        }
    }