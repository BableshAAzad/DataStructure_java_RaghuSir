package ClassTypes.OuterClass;

public class NastedStaticClass {
	static class Demo1 {
		static class Demo2 {
			static void m1() {
				System.out.println("Demo2");
			}
		}
	}

	public static void main(String[] args) {
		Demo1.Demo2.m1();
	}
}
