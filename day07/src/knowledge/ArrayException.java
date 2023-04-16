package knowledge;

import java.util.Arrays;

/*
 * 数组中的常见异常
 * 1.数组角标越界异常：
 * 	Array Index(指数，索引) Out Of Bounds(n.界限，限制;adj.必定的，受约束的；v.跳跃) Exception
 * 	ArrayIndexOutOfBoundsException
 * 
 * 2.空指针异常：
 * 	Null Pointer Exception
 * 	NillPointerException

 */

public class ArrayException {
	public static void main(String[] args) {
		
		//1.数组角标越界异常：ArrayIndexOutOfBoundsException
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		//越界输出
//		for(int i = 0;i < arr.length + 1;i++) {
//			System.out.println(arr[i] + " ");
//		}
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
at knowledge.ArrayException.main(ArrayException.java:27)
*/
		
		
		
		//2.空指针异常：Null Pointer Exception
		
		//情况一：
//		int[] arr1 = new int[] {1,2,3};
//		arr1 = null;
//		System.out.println(arr1[0]);
/*Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "arr1" is null
at knowledge.ArrayException.main(ArrayException.java:38)
*/
		
		//情况二：
//		int[][] arr2 = new int[4][];
//		System.out.println(arr2[0][0]);
/*Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "arr2[0]" is null
at knowledge.ArrayException.main(ArrayException.java:49)
 */
		
		//情况三：
		String[] arr3 = new String[]{"AA","BB","CC"};
		System.out.println(arr3[0].toString());
		//System.out.println(Arrays.toString(arr3[0]));
	}
}















