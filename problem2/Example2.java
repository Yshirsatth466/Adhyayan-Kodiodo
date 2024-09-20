package com.problem2;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter digitno:");
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        
        while(n!=0) {
        	
              	int rem=n%10;
              	if(rem%2==0) {
              		evensum+=rem;
              		
              	}else {
              		oddsum+=rem;
              		
              	}
              	n=n/10;
        	
        }
        System.out.println("sum of even digits="+evensum);
        System.out.println("sum of odd digit="+oddsum);
	}

}
