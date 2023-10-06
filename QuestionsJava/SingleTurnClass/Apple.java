package QuestionsJava.SingleTurnClass;

public class Apple {
 final static private Apple a;
// if remove to final key word then same work
    static{
        a = new Apple();
    }
// static Apple a = new Apple(); instead of block code write this line same work

   private Apple() {
         System.out.println("Bablesh AAzad");
    }

   static Apple redApple() {
        return a;
    }
}
