package ClassTypes.OuterClass;

public class NastedNonStaticClass {
	class A {
		class B {
			void b1() {
				System.out.println(" b1() method ");
			}
		}

		void a1() {
			B b = new B();
			b.b1();
		}
	}

	public static void main(String[] args) {
		NastedNonStaticClass n = new NastedNonStaticClass();
		A a = n.new A();
		a.a1();
	}
}
