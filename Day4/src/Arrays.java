
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array in 2 types
		String[] sname;
		String sName1[];
		
		//indexing
		String[] sCar= {"Toyota","Tesla","Hyundai"};
		System.out.println(sCar[1]);
		sCar[1]="Tesla Model Y"; // Modify the array. You cannot add it to the array 
		System.out.println(sCar[1]); 
		//Arrays are limited functionalities. Once create you cannot add or delete anything. Only owerriting is possible
		
		//System.out.println(sCar[10]);
		System.out.println(sCar.length);
	}

}
