package ClassTypes.InnerClass;

public class InnerNonStaticClass {

	void m1() {
		class A {
			void a1() {
				System.out.println("method a1()");
			}
		}
		A d = new A();
		d.a1();
	}

	public static void main(String[] args) {
		InnerNonStaticClass ic = new InnerNonStaticClass();
		ic.m1();
	}
}
