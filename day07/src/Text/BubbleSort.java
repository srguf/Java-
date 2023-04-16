package Text;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] arr = new int[] {43,32,76,-98,0,64,33,-21,32,99};
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		//冒泡排序
		for(int i = 0;i < arr.length - 1;i++) {/*外层表示循环几大轮*/
			
			for(int j = 0; j < arr.length - 1 - i;j++) {
				
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			
		}
		
		//输出
		int i = 0;
		while(i < arr.length) {
			System.out.print(arr[i] + " ");
			i++;
		}
	}
}
