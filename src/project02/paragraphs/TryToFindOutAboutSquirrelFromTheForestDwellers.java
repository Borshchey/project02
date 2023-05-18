package project02.paragraphs;

public class TryToFindOutAboutSquirrelFromTheForestDwellers extends Paragraph {
        public TryToFindOutAboutSquirrelFromTheForestDwellers() {
            name = "Попытаться разузнать о Бельчонке у лесных жителей";
            text = "Пока Лисёнок принимал решение, лесные жители разошлись кто куда. Остались только Сова и Волк. \n" +
                    "Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. Кого выбрать?";
        }
        @Override
        public void createOptions() {
            firstOption = new AskOwl();
            secondOption = new AskWolf();
        }
    }