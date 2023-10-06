package QuestionsJava.SingleTurnClass;

public class MainApple {
    public static void main(String[] args) {
        Apple a1 = Apple.redApple();
        System.out.println(a1);
        // ----------------------------
        Apple a2 = Apple.redApple();
        System.out.println(a2);
        // ----------------------------
        Apple a3 = Apple.redApple();
        System.out.println(a3);

        /**
         * Output :
         * Bablesh AAzad
         * QuestionsJava.SingleTurnClass.Apple@5d22bbb7
         * QuestionsJava.SingleTurnClass.Apple@5d22bbb7
         * QuestionsJava.SingleTurnClass.Apple@5d22bbb7
         */
    }
}
