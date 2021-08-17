
import java.util.Arrays;

public class Question1 {
	
	public static void main(String[] args) {
		
		int input[] = {1,4,5,4},len = input.length,maxValue = 0, k = 2;
		
		int[][] andArr = new int[len][len];
		int[][] orArr = new int[len][len];
		int[][] sumArr = new int[len][len];
		//1.Calculate and array,or array, sum array
		for(int i = 0; i < len;i++) {
			for(int j = i; j < len;j++) {
				if(i == j) andArr[i][j] = input[i];
				else {
					andArr[i][j] = andArr[i][j-1] & input[j]; 
				}
				
				if(i == j) orArr[i][j] = input[i];
				else {
					orArr[i][j] = orArr[i][j-1] | input[j]; 
				}
				
				if(i == j) sumArr[i][j] = input[i];
				else {
					sumArr[i][j] = sumArr[i][j-1] + input[j]; 
				}
				
				if(andArr[i][j] > k) {
 					maxValue = Math.max(maxValue, sumArr[i][j] + orArr[i][j]);
 				}
				
				
			}
		}
		printArray(andArr, "AND", len);
 		
 		printArray(orArr, "or", len);

 		printArray(sumArr, "sum", len);
 		
 		System.out.println("result = " + maxValue);
 		
	}
	
	public static void printArray(int[][] arr, String name, int len) {
		System.out.println("--"+ name +  "ARRAY--");
		for(int i = 0;i < len;i++)
			System.out.println(Arrays.toString(arr[i]));
	}

}
