package Example_StaticMethod;

/*
 * 工具类的封装使用
 * 
 */

public class ArrayUtilTest {
	public static void main(String[] args) {
		
		
		int[] arr = new int[] {32,34,32,5,3,54,654,-98,0,-53,5};
		int max = ArrayUtil.getMax(arr);
		System.out.println("最大值为:" + max);
		
		System.out.println("数组的总和:" + ArrayUtil.getSum(arr));
		int avg = ArrayUtil.getAvg(arr);
		System.out.println("平均值为:" + avg);
		
		System.out.println("排序前:");
		ArrayUtil.print(arr);
		ArrayUtil.sort(arr);
		System.out.println("排序后:");
		ArrayUtil.print(arr);
		
		System.out.println("查找：");
		int index = ArrayUtil.getIndex(arr, 5);
		if(index >= 0) {
			System.out.println("索引地址为" + index);
		}else {
			System.out.println("未找到该数字");
		}
		
	}
}




