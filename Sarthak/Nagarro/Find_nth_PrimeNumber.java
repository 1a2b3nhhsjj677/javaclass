package Sarthak.Sarthak.Nagarro;

import java.util.Scanner;

public class Find_nth_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner P = new Scanner(System.in);
		int n = P.nextInt();
		int i = 2;
		int f=0;
		while(i<n) {
			if(n%i==0) {
				f=f+1;
				break;
			}
			i=i+1;
		}
		if(f>=1) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}

	}
	}
	


