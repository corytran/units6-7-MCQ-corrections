//unit 7 question 15

public class SequentialSearch {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		int target = 4;
		
		int i = seqSearch(arr, target);
		int j = seqSearch2(arr, target);
		
		//method seqSearch returns the index of the first occurrence of target in arr, while method seqSearch2 returns the value of target
		System.out.println(i);
		System.out.println(j);
	}
	public static int seqSearch(int[] arr, int target) {

	for (int j = 0; j < arr.length; j++) {
		if (arr[j] == target) {
			return j;	
		}
	}
	return -1;

	}
	
	public static int seqSearch2(int[] arr, int target) {
		for (int j : arr) {
			if (j == target) {
				return j;
			}
		}
	return -1;
	}
	
}
