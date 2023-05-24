package project02;

import java.util.HashSet;

public class ParagraphsData {

    private static HashSet<Paragraph> paragraphs;

    static {
        createParagraphsSet();
    }
    private static void createParagraphsSet() {
        paragraphs = new HashSet<>();

        Paragraph askOwl = new Paragraph("Расспросить Сову",
                "Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, \n" +
                        "бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно, если \n" +
                        "Бельчонок там, ему срочно нужна помощь.");

        Paragraph askWolf = new Paragraph(
                "Расспросить Волка",
                "Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал, \n" +
                        "что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?");

        Paragraph believeOwlAndGoDeepIntoTheForest = new Paragraph(
                "Поверить Сове и отправиться вглубь леса",
                "В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был готов \n" +
                        "рассказать все, что знает, если Лисёнок принесёт ему мёда.");

        Paragraph eatALittleAndRest = new Paragraph(
                "Поесть немного и передохнуть",
                "Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. \n" +
                        "Лисёнку нужна помощь, он не сможет продолжить поиски. \n" +
                        "Игра завершилась неудачей");


        Paragraph fox = new Paragraph(
                "Лисенок",
                "Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. \n" +
                        "Это утро не было исключением. Лисёнок пришёл на их обычное место встречи, \n" +
                        "но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга. \n" +
                        "\"Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду." +
                        "\" \n- подумал Лисёнок. Как поступить Лисенку?");

        Paragraph goBackHome = new Paragraph(
                "Вернуться домой",
                "Вернувшись домой, Лисёнок нашёл там Бельчонка. Оказалось, \n" +
                        "что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. " +
                        "Он поспешил предупредить об этом Лисёнка, но они разминулись. \n" +
                        "Наконец-то друзья нашли друг друга! Игра завершилась успехом");

        Paragraph goOnASearch = new Paragraph(
                "Отправиться на поиски",
                "Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. \n" +
                        "Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.");

        Paragraph gottaTakeTheChanceAndGetSomeHoney = new Paragraph(
                "Нужно воспользоваться шансом и раздобыть мёд",
                "Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. \n" +
                        "Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.");

        Paragraph lookForASquirrelAlone = new Paragraph(
                "Искать Бельчонка в одиночку",
                "Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. \n" +
                        "Теперь его самого нужно искать. Игра завершилась неудачей");

        Paragraph ratherTakeTheHoneyToTheBear = new Paragraph(
                "Скорее отнести мёд Медвежонку",
                "Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен, \n" +
                        "что Бельчонок никогда не пошёл бы в глубь леса. \n" +
                        "Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, \n" +
                        "он также уговаривал Лисёнка вернуться домой.");

        Paragraph shouldTryToStealTheHoneyImmediately = new Paragraph(
                "Нужно попытаться выкрасть мёд немедленно",
                "Это была не лучшая идея. Пчёлы покусали Лисёнка, теперь ему самому нужна помощь. \n" +
                        "Игра завершилась неудачей");

        Paragraph tryToFindOutAboutSquirrelFromTheForestDwellers = new Paragraph(
                "Попытаться разузнать о Бельчонке у лесных жителей",
                "Пока Лисёнок принимал решение, лесные жители разошлись кто куда. Остались только Сова и Волк. \n" +
                        "Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. Кого выбрать?");

        Paragraph waitSuddenlyTheBeesWillFlyAway = new Paragraph(
                "Подождать, вдруг пчёлы улетят",
                "Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда. \n" +
                        "Вдруг он понял, что очень голоден. Что же делать?");

        fox.setFirstOption(goBackHome);
        fox.setSecondOption(goOnASearch);

        askOwl.setFirstOption(believeOwlAndGoDeepIntoTheForest);
        askOwl.setSecondOption(lookForASquirrelAlone);

        askWolf.setFirstOption(goBackHome);
        askWolf.setSecondOption(lookForASquirrelAlone);

        believeOwlAndGoDeepIntoTheForest.setFirstOption(lookForASquirrelAlone);
        believeOwlAndGoDeepIntoTheForest.setSecondOption(gottaTakeTheChanceAndGetSomeHoney);

        goOnASearch.setFirstOption(tryToFindOutAboutSquirrelFromTheForestDwellers);
        goOnASearch.setSecondOption(lookForASquirrelAlone);

        gottaTakeTheChanceAndGetSomeHoney.setFirstOption(waitSuddenlyTheBeesWillFlyAway);
        gottaTakeTheChanceAndGetSomeHoney.setSecondOption(shouldTryToStealTheHoneyImmediately);

        ratherTakeTheHoneyToTheBear.setFirstOption(lookForASquirrelAlone);
        ratherTakeTheHoneyToTheBear.setSecondOption(goBackHome);

        tryToFindOutAboutSquirrelFromTheForestDwellers.setFirstOption(askOwl);
        tryToFindOutAboutSquirrelFromTheForestDwellers.setSecondOption(askWolf);

        waitSuddenlyTheBeesWillFlyAway.setFirstOption(eatALittleAndRest);
        waitSuddenlyTheBeesWillFlyAway.setSecondOption(ratherTakeTheHoneyToTheBear);


        paragraphs.add(askOwl);
        paragraphs.add(askWolf);
        paragraphs.add(believeOwlAndGoDeepIntoTheForest);
        paragraphs.add(eatALittleAndRest);
        paragraphs.add(fox);
        paragraphs.add(goBackHome);
        paragraphs.add(goOnASearch);
        paragraphs.add(gottaTakeTheChanceAndGetSomeHoney);
        paragraphs.add(lookForASquirrelAlone);
        paragraphs.add(ratherTakeTheHoneyToTheBear);
        paragraphs.add(shouldTryToStealTheHoneyImmediately);
        paragraphs.add(tryToFindOutAboutSquirrelFromTheForestDwellers);
        paragraphs.add(waitSuddenlyTheBeesWillFlyAway);
    }

    public static Paragraph getParagraphByName(String name) {
        return paragraphs.stream().filter(paragraph -> name.equals(paragraph.getName())).findFirst().get();
    }
}


