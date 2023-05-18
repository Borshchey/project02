package project02.paragraphs;

public class GoOnASearch extends Paragraph {
        public GoOnASearch() {
            name = "Отправиться на поиски";
            text = "Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. \n" +
                    "Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.";
        }
        @Override
        public void createOptions() {
            firstOption = new TryToFindOutAboutSquirrelFromTheForestDwellers();
            secondOption = new LookForASquirrelAlone();

        }
    }