
public class MultiArray {

	public static void main(String[] args) {
		
		int[] iArr = {1,2,3,4,5};
		System.out.println(iArr[1]);
	
		int iArrMul[][] = {{1,2,3},{4,5,6}}; // 2x3
		System.out.println("to print 1 :"+iArrMul[0][0]);
		System.out.println("to prin :"+iArrMul[1][1]);
		System.out.println("to print 1 :"+iArrMul[1][2]);
		
		
		int[][] iMul2= {{1,2,3},{15,6,17},{25,100},{3,7},{10,20,30}};
		System.out.println(iMul2[2][1]);
		
		System.out.println(iMul2.length);
		System.out.println(iMul2[1].length);
		
		// Array inside array
		int[][][] mul3 = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
		
		System.out.println(mul3[0][1][1]);
		
		System.out.println(mul3[1][1][1]);
		
		int[][][] mul4 = {{{1,2,3},{4,5,6},{7,8,9},{10,11,12}}};
		System.out.println(mul4[0][3][2]);
		
	}

}
