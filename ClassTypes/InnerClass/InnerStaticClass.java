package ClassTypes.InnerClass;

public class InnerStaticClass {
	static void m1() {
		class A {
			static void a1() {
				System.out.println("method a1()");
			}
		}
		A.a1();
	}

	public static void main(String[] args) {
		InnerStaticClass.m1();
	}
}
