package Scorify_folder;

import java.util.Scanner;

public class Ramadan_Marathon_30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Case=sc.nextInt();
		for(int o=0;o<Case;o++){
			int N=sc.nextInt();
			double sum=0;
			for(int i=0;i<N;i++){
				sum +=sc.nextInt();
			}
			
			double quotient=sum/N ;
		
				if(Math.floor(quotient)-quotient ==0)
				{
					System.out.println(N);
				}else
				{
					
					System.out.println(N-1);
				}
			
			
		}
		
		
		
	}

}
