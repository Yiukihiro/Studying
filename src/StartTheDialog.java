public class StartTheDialog {
    public static String startTheDialog() {
        System.out.println("Привет, это обучающая программа, подобная ромком новелле, в которой тебе предстоит создать" +
                " " + "персонажа и пообщаться с ним");
        System.out.println("Пожалуйста введи имя будущей Девушки");
        return new AnswerInput().answerInput();
    }
}
