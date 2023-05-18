package project02.paragraphs;

public class RatherTakeTheHoneyToTheBear extends Paragraph {
        public RatherTakeTheHoneyToTheBear() {
            name = "Скорее отнести мёд Медвежонку";
            text = "Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен, \n" +
                    "что Бельчонок никогда не пошёл бы в глубь леса. \n" +
                    "Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, \n" +
                    "он также уговаривал Лисёнка вернуться домой.";
        }
        @Override
        public void createOptions() {
            firstOption = new LookForASquirrelAlone();
            secondOption = new GoBackHome();
        }
    }