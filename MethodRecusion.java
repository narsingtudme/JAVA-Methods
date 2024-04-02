// Runtime erro i e Stackoverfloeerror
class MethodRecusion
{
	public static void main(String[] args) {
		System.out.println("Hie from main()");
		m1();
		System.out.println("Bye from mainn()");

	}public static void m1() {
		System.out.println("hie from m1()");
		String [] person={"naru","gotya"};
		main(person);
		System.out.println("Bye from m1()");
	}
}