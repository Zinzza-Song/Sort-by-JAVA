
public class BubbleSolt {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 1, 6, 5 };
		int temp = 0; // 빈공간
		int round = 0;
		
		

		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int k : arr)
			System.out.print(k + " ");
		
	}
}