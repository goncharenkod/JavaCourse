package simpleStructures.arrays;

public class SortArray {

	public static void sort(String[] args) {
		
		int[] arr = {9,8,5,2,4,3,7,6,1,0};
		
		int size = 10;
		for (int i=0; i<size-1; i++) {
			
			for (int j=i+1; j < size; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.println(arr[i]);
		}
	}
}