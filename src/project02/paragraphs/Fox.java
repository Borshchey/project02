package project02.paragraphs;

public class Fox extends Paragraph {
        public Fox(){
            name = "Лисенок";
            text = "Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. \n" +
                    "Это утро не было исключением. Лисёнок пришёл на их обычное место встречи, \n" +
                    "но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга. \n" +
                    "\"Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду." +
                    "\" \n- подумал Лисёнок. Как поступить Лисенку?";
        }

        @Override
        public void createOptions() {
            firstOption = new GoBackHome();
            secondOption = new GoOnASearch();
        }
    }