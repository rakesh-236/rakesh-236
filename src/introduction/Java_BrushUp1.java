package introduction;

public class Java_BrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec= 5.99;
		boolean mycard = true;
		
		System.out.println(myNum + " is the value store in the myNum varible");
		System.out.println(website + " \n");
		System.out.print(letter + "\t");
		System.out.println(dec);
		System.out.println(mycard);
		
		//Array - 
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		int[] arr2 = {1,2,4,5,6,7,8,9,10,122};
		System.out.println(arr2[2] + "\n ");
		
		//for loop
		for(int i=0; i<arr.length; i++) 
		{
			System.out.println(arr[i]);
			
		}
		
		for (int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] name = {"rahul", "shetty", "selenium"};
		System.out.println();
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		//enhanced forloop
		
		for(String s: name)
		{
			System.out.println(s);
		}
		
		
	}

}
