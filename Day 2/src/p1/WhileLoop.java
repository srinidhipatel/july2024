package p1;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 *  while(condition){
		 *  statements(s);
		 *  
		 *  }
		 * 
		 * */
//		int i=1;
//		while(i<10) {
//			System.out.println(" Value of I : "+i);
//			i++;
//		}

		int var=10;
		boolean flag = true;
		while(flag == true) {
			System.out.println("Value of var "+ var); //10
			var=var + 10;
			if(var >=30) {
				flag=false;
			}
		}
	}

}
