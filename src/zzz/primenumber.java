package zzz;

import java.util.*; 

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       int counter = 0;
	      
	    	   for (int i=1; i<=n; i++) {
	    		   if(n%i == 0) {
	    		counter++;
	    		   }}

	       
	       if (counter == 2) {
	    	   System.out.println("Prime Nu");
	       } else {
	    	   System.out.println("Not Prime");
	       }


	}}