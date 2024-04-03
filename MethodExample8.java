class MethodExample8
{
	public static void main(String[] args) {
		byte a=10;
		byte b=10;
		add(b+0,a); // CTE b+0=int
	}
	public static void add(byte num1,int num2) {
		System.out.println("byte, int");
	}public static void main(int num1,int num2) {
		System.out.println("int, int");
	}
}