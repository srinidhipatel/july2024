package p1;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Amruta");
//		System.out.println("Amruta");
//		System.out.println("Amruta");
//		System.out.println("Amruta");
//		System.out.println("Amruta");
//		System.out.println("Amruta");
//		System.out.println("Amruta");
//		
		/*
		 *  Syntax
		 *  for(intiazation; condition; increment/decrement){
		 *  
		 *  Statement
		 *  }
		 * 
		 *  1. intializaton --> Will happen only one time
		 *  2. check the condetion
		 *  3. If condition true or satisifies
		 *  4. Execute the statement within loop
		 *  5. Increment the value by 1 (++)
		 *  6. repeat the steps from 2
		 *  
		 * 
		 * */
//		for(int i=1; i<=10;i++) {
//			//System.out.println(" print the value of i ="+ i);
//			System.out.println("amruta");
//			
//		}

//		for(int i=10; i>0;i--) {
//			System.out.println("Value of I : "+i);
//		}
		
//		for(int i=1; i<=15; i=i+2) {
//			System.out.println("Value of I : "+i);
//		}
		
//		for(int i=1; i<10;i++) {
//			System.out.println("Value of I : "+i);
//			if(i==5) {
//				//break;  // To stop
//				System.out.println("Count number 5 and proceeding further");
//				//continue;
//				//break;
//			}
//		}
		
		String[] arrName = {"Srinidhi","Uma", "Soumya","Srija","Amruta"};//indexing starts from 0
		//For each loop:
		
		// for( String str : variableTryingTopassItToForEachLoop){
		// 
		// }
		
		for(String str:arrName) {
			System.out.println(str);
		}
		
		int[] numbers = {1,2,3,4,5};
		
		for(int a:numbers) {
			System.out.println(a);
		}
		
		// Print the number from 1 to 10 using for loop, while loop and do while loop
		// Print the number from 10 to 1 using for loop, while loop and do while loop
		// Print the number from 1 to 100 using for loop, while loop and do while loop with an increment of 10
		// Print the number from 100 to 11 using for loop, while loop and do while loop with an decrement of 10
		// Write a nested for loop to make the count as 100 times
		
	}

}
