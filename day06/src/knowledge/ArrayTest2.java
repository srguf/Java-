package knowledge;
/*二维数组的使用
 * 二维数组的使用 
 * 1.对于二维数组的理解，我们可以看成是一维数组Array1
 * 	 又作为另一个一维数组Array2的元素而存在。
 * 其实，从数组底层的运行机制来看，其实没有多维数组
 * 
 *  2.二维数组的使用
 * 	 1)二维数组的声明和初始化
 * 	 2)如何调用数组的指定位置的元素
 *   3)如何获取数组的长度
 *   4)如何遍历数组
 *   5)数组元素的默认初始化值
 *   	>针对于初始化值方式一：比如int[][] arr = new int[4][3];
 *     		外层元素的初始值为：地址值
 *     		内层元素的初始化值为：与一维数组初始化情况相同
 *   	>针对于初始化值方式二：比如int[][] arr = new int[4][];
 *     		外层初始化值为：null
 *     		内层初始化值空指针报错
 *   6)二维数组的内存解析
 *   
 */

public class ArrayTest2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//1)二维数组的声明和初始化
		int[] arr = new int[] {1,2,3};//一维
		//二维数组静态初始化
		int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
		//动态初始化(两种方式)
		String[][] arr2 = new String[3][2];
		String[][] arr3 = new String[3][];
		//错误的情况：String[][] arr2 = new String[][2];
				 //String[][] arr2 = new String[3][2]{{1,2},{6,5},{7,8}};
		//正确：
		int[] arr4[] = new int[][]{{1,2,3,5},{4,5},{6,7,8}};
		int[] arr5[] = {{1,2,3},{4,5},{6,7,8}};//类型推断
		System.out.println("******************");
		
		
		//2)如何调用数组的指定位置的元素
		System.out.println(arr1[0][1]);//2
		System.out.println(arr2[1][1]);//null
		
		arr3[1] = new String[4];
		System.out.println(arr3[1][0]);//null
		System.out.println("******************");
		
		
		//3)如何获取数组的长度
		System.out.println(arr4.length);//3
		System.out.println(arr4[0].length);//4
		System.out.println(arr4[1].length);//2
		System.out.println(arr4[2].length);//3
		System.out.println("******************");
		

		
		//4)如何遍历数组
		for(int i = 0;i < arr4.length;i++) {
			for(int j = 0;j < arr4[i].length;j++) {
				System.out.print(arr4[i][j] + " ");
			}	
			System.out.println();
		}
		System.out.println("******************");

		
		
		//二维数组的使用：
		//规定：二维数组分为外层数组元素，内层数组元素
			int[][] arr6 = new int[4][3];
			//外层元素：arr6[0],arr6[1];
			//内层元素：arr6[0][0];arr6[1][2]等；
			
		//5)数组元素的默认初始化值
		System.out.println(arr6[0]);//[I@515f550a
		System.out.println(arr6[0][0]);//0
		System.out.println(arr6);//[[I@626b2d4a
		System.out.println("******************");
		
		String[][] arr7 = new String[4][2];
		System.out.println(arr7[1]);//地址
		System.out.println(arr7[1][1]);//null
		System.out.println("******************");
		
		double[][] arr8 = new double[4][];
		System.out.println(arr8[1]);//null
		//System.out.println(arr8[1][0]);
			//空指针报错
		System.out.println("******************");
		
	}
}






