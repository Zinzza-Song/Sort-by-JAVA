
public class CountingSolt {

	public CountingSolt(int[] arr) {
		sort(arr);
	}

	int[] sort(int[] arr) {
		int max = 0;
		for (int k : arr)
			max = Math.max(max, k);

		int[] counting = new int[max + 1];

		for (int k : arr)
			++counting[k];

		for (int i = 1; i < counting.length; ++i)
			counting[i] += counting[i - 1];

		int[] sortedArr = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; --i) {
			sortedArr[counting[arr[i]] - 1] = arr[i];
			--counting[arr[i]];
		}

		return sortedArr;
	}

}
