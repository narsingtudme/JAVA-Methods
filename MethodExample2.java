class MethodExample2
{
	public static void main(String[] args) {
		System.out.println("Main Starts");
		mahesh();
		System.out.println("Main  Ends");
	}
	public static void mahesh() {
		System.out.println("mahesh starts");
		suresh();
		System.out.println("mahesh ends");
		
	}
	public static void suresh() {
		System.out.println("suresh starts");
		ramesh();
		System.out.println("suresh ends");
	}
	public static void ramesh() {
		System.out.println("ramesh starts");
		System.out.println("ramesh ends");
	}
	
}