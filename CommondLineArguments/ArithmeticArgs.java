package CommondLineArguments;

public class ArithmeticArgs {
    public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[2]);
		switch (args[1]) {
		case "+":
			System.out.println("Sum is :" + (x + y));
			break;
		case "-":
			System.out.println("differnce is :" + (x - y));
			break;
		case "*":
			System.out.println("Product is :" + (x * y));
			break;
		case "/":
			System.out.println("Qutient is :" + (x / y));
			break;
		case "%":
			System.out.println("Reminder is :" + (x % y));
			break;
		default:
			throw new IllegalArgumentException("UnExpected symbol : " + args[1]);
		}
	}
}
