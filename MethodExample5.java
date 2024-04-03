class MethodExample5
{
	public static void main(String[] args) {
		byte a=10;
		add(a,20);
	}
	public static void add(byte num1,int num2) {
		System.out.println("byte , int");

	}
	public static int add(byte num1,int num2) {
		System.out.println("byte , int" );
		return 0;
	}
}// cte method signature is same 