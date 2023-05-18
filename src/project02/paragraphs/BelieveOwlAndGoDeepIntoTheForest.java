package project02.paragraphs;

public class BelieveOwlAndGoDeepIntoTheForest extends Paragraph {
        public BelieveOwlAndGoDeepIntoTheForest() {
            name = "Поверить Сове и отправиться вглубь леса";
            text = "В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был готов \n" +
                    "рассказать все, что знает, если Лисёнок принесёт ему мёда.";
        }
        @Override
        public void createOptions() {
            firstOption = new LookForASquirrelAlone();
            secondOption = new GottaTakeTheChanceAndGetSomeHoney();
        }
    }