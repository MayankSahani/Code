package com.mayank.s1;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Practis {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		 Scanner in=new Scanner(new File("D:\\Work\\Workplace\\PractiseAgain\\src\\input"));
	       int t = in.nextInt();
	       int n=0;
	        for(int a0 = 0; a0 < t; a0++){
	             n = in.nextInt();
	        
	        int count3=0;
	        int count5=0;
	        if(n>=3)
	        {    count3=0;
	        	 count5=0;
	        	if(n%3==2)
	        	{
	        		count3=1;
	        		count5=n/3-1;
	        	}
	         if(n%3==0)
	        	{
	        		
	        	}
	         if(n%5==3)
	        	{
	        	 if(1>=count5)
	        	 {
	        		count5=1;
	        		count3=n/5;
	        	 }
	        	}
	        	if(n%5==0)
	        	{
	        		if(0>=count5)
		        	 {
	        		count5=0;
	        		count3=n/5;
		        	 }
	        	}
	         if(n%5==1)
	        	{
		        	 if(2>=count5)
		        	 {
		        		count5=2;
		        		count3=n/5-1;
		        	}
	        	}
	        }
	       if(count3!=0||count5!=0)
	       {
	    	   while(count5>0)
	    	   {
	    		   System.out.print("555");
	    	   count5--;
	    	   }
	    	   while(count3>0)
	    	   {
	    		   System.out.print("33333");
	    		   count3--;
	    	   }
	    	   System.out.println("");
	       }
	       else
	    	   System.out.println("-1");
	        	
	    }
	}
}