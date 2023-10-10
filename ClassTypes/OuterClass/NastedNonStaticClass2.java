package ClassTypes.OuterClass;

public class NastedNonStaticClass2 {
	class A {
		class B {
			void b1() {
				System.out.println(" b1() method ");
			}
		}
	}

	public static void main(String[] args) {
		NastedNonStaticClass2  ns = new NastedNonStaticClass2();
		ns.new A().new B().b1();
	}
}
