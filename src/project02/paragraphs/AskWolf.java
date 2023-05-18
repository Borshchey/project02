package project02.paragraphs;

public class AskWolf extends Paragraph {
        public AskWolf() {
            name = "Расспросить Волка";
            text = "Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал, \n" +
                    "что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?";
        }

        @Override
        public void createOptions() {
            firstOption = new GoBackHome();
            secondOption = new LookForASquirrelAlone();
        }
    }