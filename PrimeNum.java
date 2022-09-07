package day6;
import java.util.*;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find pime or not : ");
		num = sc.nextInt();
		for(int i = 2; i <= num - 1; i++) {
			if(num % i == 0) {
				temp = temp+ 1;
			}
		}
			if(temp > 2) {
				System.out.println(num + "Not a prime number");
			}else {
				System.out.println(num + "is a prime number");
			}
		
	}

}
