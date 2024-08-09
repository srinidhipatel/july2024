
public class ScopeOfVariable {

	static int z=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(a);
		int a = 0;
		System.out.println(a);
		System.out.println(z);
		int b=1;
		//System.out.println(c);
		
		for(int i=0;i<2;i++) {
			//System.out.println(c);
			int c=2;
			System.out.println(c);
			System.out.println(c);
		}
		int i=0;
		//int a=0
		//System.out.println(c);
		/*
		 * Scope of the variable will start after the intialisation
		 * Scope of the variable limited to methods and loops
		 * Global variables can be accessed globally
		 * */
	}

	
	
}
