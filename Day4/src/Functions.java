import java.awt.DisplayMode;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=50;
		int b=60;
		//int c = a+b;
		//System.out.println(c);
		
		add(a, b);
		int c = add(100,200); //int d=100; int e =200; System.out.println(d+e);
		System.out.println("Return value of c : "+c);
		multiply(c, 59);
		
		
		//add(500,600); //
		
		//a+b// adding two numbers
		// (a+b) multiply by 2
		
		System.out.println(subtraction (500,200));
		disply();
	}
	/* syntax of method
	 *  public static void methodName(parmater1, par2, par3){
	 *  
	 *  
	 *  }
	 *  any thing which is repeatedly doing can be put that in blocks or any thing whihc is doing separate functionality can be managed using methods
	 * 
	 *  Return statement is the last statemnet in a method.
	 *  
	 * */
	
	public static int add(int val1, int val2) {
		System.out.println(val1+val2);
		return val1+val2;
	}

	public static void multiply(int val1, int val2) {
		System.out.println(val1*val2);
	}
	
public static int subtraction(int val1, int val2) {
	int res;
	if(val2 >= val1) // if yo uneed more than 1 statement inside the if loop then paranthesis is mandatory. if user dont give any paranthesis immediate stetement will be considered as if stement block
		return val2 - val1;
	
	else
		return val1 - val2;
}
//	}
	
public static void disply() {
	System.out.println("printing Nidhi");
}
}
