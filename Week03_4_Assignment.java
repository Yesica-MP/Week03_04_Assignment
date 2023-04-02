package week03_4Assignment;

public class Week03_4_Assignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//1.Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.	
		
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
	
		int x = ages[ages.length-1] - ages[0];
		System.out.println("Substraction: " + x);	
		
		//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.		
		
		int add = 0;
		for(int i = 0; i < ages.length ; i ++) {
			add += ages[i];
						
		}
		double s = (double) add / ages.length;
		
		System.out.println("The average age is: " + s);
		
		
	//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int a = 0;
		for(String name : names) {
		a += name.length();		
		}
		double avg = (double)a/names.length;
	    System.out.println("Average Number of Letters: "+ avg);
		
		//b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
	    String conc = "";
	    for(String na : names) {
	    	conc += na + " ";
	    }
	    System.out.println("Names: " + conc.trim());
	    
	    
	 //3.	How do you access the last element of any array?
	    
	    System.out.println("Last Element: " + names[names.length-1]);
	    
	 //4.	How do you access the first element of any array?
	    
	    System.out.println("First Element: " + names[0]);
	    
	 /*5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add 
	        the length of each name to the nameLengths array.
	  */
	    
	    int[] nameLengths = new int[names.length];
	    for(int i = 0 ;i < names.length; i++) {
	    	nameLengths[i] = names[i].length();
	    }
	   for (int j : nameLengths) {
		   System.out.println(j);
	   }
	    
	
	    
	   /*6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
	    Print the result to the console.
	    */
	   int sm = 0;
	    for(int k : nameLengths) {
	    	sm += k;
	    	
	    }
	    System.out.println("The sum of nameLengths array is: " + sm);
	    
	    
	    /*
	    7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	    (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	    */
	   String paris = "Hi";
	   int nmrto = 8;
	   System.out.println(concName(paris, nmrto));
	    
	    
	    /*
	    8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
	    (the full name should be the first and the last name as a String separated by a space).
	   */ 
	    
	    String naame = "Penelope";
	    String ape = "Cruz";
	    System.out.println("Full Name: " + fullName(naame, ape));
	    
	    //9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	    
	    System.out.println("Sum: " + sum(ages));
	    
	    //10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	    
	    double[] arr = {10.3, 15.5, 7.8, 2.5};
	    System.out.println("Average of all the elements in the array: " + averageNumbers(arr));
	    
	    /*11.	Write a method that takes two arrays of double and returns true if the average 
	     * of the elements in the first array is greater than the average of the elements in the second array.
	     */
	    
	    double[] sec = {10.3, 15.5, 17.8, 22.5};
	    System.out.println(average(arr, sec));
	    
	    
	    /*12.	Write a method called willBuyDrink that takes a boolean isHotOutside, 
	     * and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	     */
	    
	    System.out.println(willBuyDrink(true, 12.00));
	
	    
	    //13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	
	   /* Design a method that takes an integer  'total' and calculates the tip amount that should be left for the waitress 
	    * based on the total bill. The tip percentage corresponding to the total bill amount is determined by the following rules: 
	    * If the total bill is less than 20, the tip should be 10%. 
	    * If the total bill is between 20 and 49, the tip should be 15%. 
	    * If the total bill is between 50 and 99, the tip should be 20%. 
	    * For total bills exceeding 100, the tip should be 25%.
	    * The method should return the calculated total including tip*/
	    
	 double t = 184.50;
	 System.out.println(tips(t));
	    
	}
	
	
	//Method 7.
	public static String concName(String word, int n) {
	
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(word);
		}
		return sb.toString();
	}
	
	
	//Method 8.
	public static String fullName(String firstName, String lastName) {
		
		StringBuilder fn = new StringBuilder();
		fn.append(firstName + " ");
		fn.append(lastName);
				return fn.toString();
	}
	
	//Method 9.
	public static boolean sum (int[] array) {
		int summ = 0;
		for(int i = 0; i < array.length ; i++) {
			summ += array[i];
			if (summ < 100) {
			}	
			
		}
		return summ > 100;
	}
	
	//Method 10.
	public static double averageNumbers (double[] array) {
		double r = 0;
		for (int i = 0 ; i < array.length ; i++) {
			r += array[i];
			
		}
		double result = r/array.length;
		return result;
		
	}
	//Method 11.
	public static boolean average (double[] array1, double[] array2) {
		double avr1 = 0;
		
		double avr2 = 0;
		for (int i = 0; i < array1.length ; i++) {
			avr1 += array1[i];
		}
		for (int i = 0 ; i < array2.length ; i++) {
			avr2 += array2[i];
		}
		return avr1 > avr2;
		
	}
	
	//Method 12.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		return isHotOutside && moneyInPocket > 10.50;
		
		}
	
	//Method 13.
	public static double tips(double total) {
		double q = 0;
		if(total < 20) {
			 q = (total * 10)/100;
			
		}else if (total < 50) {
			 q = (total * 15)/100;
		}else if  ( total < 100) {
			q = (total * 20)/100;
		}else {
			q = (total * 25)/100;
		}
		return q + total;
	}
	
}
