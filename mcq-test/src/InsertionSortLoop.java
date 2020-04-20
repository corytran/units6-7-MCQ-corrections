
public class InsertionSortLoop {
	
	public static void main(String[] args) {
		int[] arr = {10, 8, 3, 4};
		insertionSort(arr);
	}
	public static void insertionSort(int[] elements) {

		for (int j = 1; j < elements.length; j++)	{
	
			int temp = elements[j];
			int possibleIndex = j;
	
			while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex--; 
				//executed each time an element is shifted to the right
				System.out.println("*");
			}
			elements[possibleIndex] = temp;
		
		}

	}
}
