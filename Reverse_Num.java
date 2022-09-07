package day6;

import java.util.Scanner;

public class Reverse_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int remainder, Rev_num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to Reverse: ");
		int num = sc.nextInt();
		sc.close();
		while(num > 0){
			remainder = num % 10;
			Rev_num = ((Rev_num * 10) + remainder);
			num = num / 10;
		}
		System.out.println("The Reversed Number is :" + Rev_num);
	}

}
