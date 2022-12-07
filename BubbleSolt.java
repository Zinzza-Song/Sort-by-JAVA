
public class BubbleSolt {

	private int[] arr;
	
	public BubbleSolt(int[] arr) {
		this.arr = arr;
	}
	
	int[] sort() {
		int temp = 0; // 빈공간

		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		return arr;
	}
}
