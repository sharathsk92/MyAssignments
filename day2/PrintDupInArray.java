package week1.day2;

public class PrintDupInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int count = arr.length;
		
		for (int i = 0; i < count; i++) {
			for (int j = i+1; j < count-1; j++) {
				if (arr[i]==arr[j]) {
				
					System.out.println(arr[i]);
					}
				}
			}
		}

	}
