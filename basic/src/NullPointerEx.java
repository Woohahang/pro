import java.util.Iterator;

public class NullPointerEx {

	public static void main(String[] args) {

//		int A[] = new int[4];
//		int B[] = new int[3];
//		int C[] = new int[4];
//
//		int a[] = { 7, 17, 37, 8 };
//		int b[] = { 47, 57, 67 };
//		int c[] = { 87, 97, 107, 8 };
//
//		int Box[][] = { A, B, C };
//
//		for (int i = 0; i < A.length; i++) {
//			A[i] = a[i];
//		}
//
//		for (int i = 0; i < B.length; i++) {
//			B[i] = b[i];
//		}
//
//		for (int i = 0; i < C.length; i++) {
//			C[i] = c[i];
//		}
//
//		
//		for (int[] is : Box) {
//			for (int is2 : is) {
//				System.out.printf(" %3d", is2);
//			}
//			System.out.println();
//		}

		int box[][] = { { 7, 17, 37, 8 }, { 47, 57, 67 }, { 87, 97, 107, 8 } };
		
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				System.out.print(box[i][j]);
			}
			System.out.println();
		}
		

	}
}
