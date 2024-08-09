package p1;

import java.util.Scanner;

public class SwitchCond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.println( "Input the value a :");
//		int a= scanner.nextInt();
//		scanner = new Scanner(System.in);
//		System.out.println( "Input the value b :");
//		int b= scanner.nextInt();
//		System.out.println(a+b);
		
		/*
		 *  Switch ( variable or integer expression){
		 *  
		 *   case a:
		 *   
		 *   break;
		 *   Case b:
		 *    break;
		 *    
		 *    default:
		 *    
		 *    
		 *  
		 *  }
		 *  
		 * 
		 * 
		 * 
		 * */
		String airthmaticFunction = "SUM";
		int c = 10;
		int d = 20;
				
		switch(airthmaticFunction){
		
		case "sum":
			System.out.println("Sum of the values "+ (c+d));
			break;
			
		case "sub":
			System.out.println(d-c);
			break;
		case "mul":
			System.out.println(c*d);
			break;
		case "div":
			System.out.println("Division of c and d : "+d/c);
			break;
		default:
			System.out.println(" right airthmatic function is not used");
			
		}
		
		
	}

}
