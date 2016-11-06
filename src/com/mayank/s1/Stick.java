package com.mayank.s1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Stick {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in=new Scanner(new File("D:\\Work\\Workplace\\PractiseAgain\\src\\input"));
		//Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        while(check(arr))
        {
        	int m=minimum(arr);
        	int count=0;
        	for(int i=0;i<arr.length;i++)
        	{
        		if(arr[i]!=0)
        		{
        			arr[i]-=m;
        			count++;
        		}
        		
        	}
        	System.out.println(count);
        }

	}

	private static int minimum(int[] arr) {
		// TODO Auto-generated method stub
		int min=0,k;
		for(k=0;k<arr.length;k++)
        {
        	if(arr[k]!=0)
        	{
        		min=arr[k];
        	break;
        	}
        }
		for(int j=k+1;j<arr.length;j++)
        {
        	if(arr[j]!=0&&arr[j]<min)
        		min=arr[j];
        }
		return min;
	}

	private static boolean check(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
				return true;
		}
		return false;
	}

}
