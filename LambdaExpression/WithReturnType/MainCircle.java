package LambdaExpression.WithReturnType;

public class MainCircle {
    public static void main(String[] args) {
       /**  Circle cir = new Circle() {
            @Override
            public double getArea(double r) {
                return 3.143 * r * r;
            }
        };
        System.out.println(cir.getArea(5.6)); // Output : 98.56447999999997
        */
        // Circle cir = (double r)-> {return 3.143*r*r;};
        // Circle cir = (double r)-> 3.143*r*r;
        // Circle cir = (r)-> 3.143*r*r;
        Circle cir = r-> 3.143*r*r;
        System.out.println(cir.getArea(5.6));  // Output : 98.56447999999997
    }
}
