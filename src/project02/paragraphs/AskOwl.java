package project02.paragraphs;

public class AskOwl extends Paragraph {

        public AskOwl() {
            name = "Расспросить Сову";
            text = "Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, \n" +
                    "бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно, если \n" +
                    "Бельчонок там, ему срочно нужна помощь.";
        }

        @Override
        public void createOptions() {
            firstOption = new BelieveOwlAndGoDeepIntoTheForest();
            secondOption = new LookForASquirrelAlone();
        }
    }