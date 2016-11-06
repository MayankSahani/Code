package com.mayank.s1;
import java.util.HashMap;

public class Max {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={3,2,56,7,88,99,23,44,55,100};
int max=arr[0];
HashMap <String,String>hs=new HashMap<String,String>();
hs.put("mayank","sahani");
System.out.println(hs.get("mayank"));
for(int i=1;i<arr.length;i++)
{
	if(arr[i]>max)
		max=arr[i];
}
System.out.println(max);
	}

}
