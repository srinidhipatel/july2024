
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		/* Reverse String  USA --> ASU
			USA
			
			ASU
		
		*/
		
		String str = "Amruta";
		System.out.println(str);
		
		char c;
		String sReverseString="";
		
		for(int i=str.length()-1;i>=0;i--) {
			c=str.charAt(i);
			sReverseString=sReverseString+c;
		}
		System.out.println("RESULTS ::: "+sReverseString);
		
		//Arrays:
//		String Name= "srinidhi";
//		String[] arrName = {"Srinidhi","Uma", "Soumya","Srija","Amruta"};//indexing starts from 0
//		System.out.println(Name);
//		System.out.println(arrName);
//		System.out.println(arrName[4]);
//		System.out.println(arrName.length);
//		
//		char c = 'a';   Arrays, Char, Indexing, Indexing inside loop, leangth arrya or string, Reverse string problem
		
		
	}

}
