package day6;
import java.util.*;
public class Perfect_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find perfect number or not");
		int num = sc.nextInt();
		
		
		for(int i = 1; i < num; i++) {
			if(num%i==0) {
				
				sum = sum + i;
				System.out.println(i+"");	
			}
		}
			if(num == sum) {
				System.out.println(num+" is a perfect number");	
				}
			else {
				System.out.println(num+" is not a perfect number");	
				}
		}
}
