package p1;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  do{
		 *  
		 *  statements
		 *  }while(condition)
		 * 
		 *  do while statement will always execute once 
		 * 
		 * */
		
//		int i = 10;
//		do {
//			System.out.println("Value of I : "+ i);
//			i++;
//		}while(i<=20);
//		
//		int i = 100;
//		do {
//			System.out.println("Value of I : "+ i);
//			i++;
//		}while(i<=20);
//		

		int count = 1;
		for(int i=0;i<10;i++){ //every class --> 1st, 2nd standard standard 0,
			
			for(int j=0;j<5;j++)//every student names in each of the standard  i = 0 (0,1,2,3,4), i=1 (0,1,2,3,4,5)
			{
				System.out.println("i = "+i+" and j = "+j );
				System.out.println(count);
				count++;
			}
		} 
		// Continue and break
		
	}

}
