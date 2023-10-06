package QuestionsJava.SingleTurnClass;

public class Banana {
    static Banana b = new Banana();

    private Banana() {
        System.out.println("Banana constructor");
    }

    static Banana yellowBanana() {
        return b;
    }
}
