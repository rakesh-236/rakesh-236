package introduction;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr2 = {1,2,4,5,6,7,8,9,10,122};
		//2,4,6,8,10,122
		
		for(int i=0; i<arr2.length; i++)
		{
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				//break;
			}
			else
			{
				System.out.println(arr2[i] +"is not mutiple of 2");
				
			}
		
		}
		
		ArrayList<String> a =new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selenium");
		System.out.println(a.get(3));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
