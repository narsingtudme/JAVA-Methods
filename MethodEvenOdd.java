import java.util.Scanner;
class MethodEvenOdd
{
	public static void main(String[] args) {
		for(int i=1; i<=20; i++){
			evenOdd(i);

		}
	}public static void evenOdd(int num) {
		if(num%2==0){
			System.out.println(num+" no is evnn");
		}else{
			System.out.println(num+" no is odd");

		}
	}
}
