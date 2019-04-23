// Java program to illustrate 
// scope of Initializing variables 
// within the loop 
public class Example5 
{ 
	public static void main(String[] args) 
	{ 
		// x and y scope is only 
		// within for loop 
		for(int x = 0, y = 0; x < 3 && y < 3; x++, y++) 
		{ 
			System.out.println(y + " "); 
		} 
	
		System.out.println(x); 
	} 
} 
