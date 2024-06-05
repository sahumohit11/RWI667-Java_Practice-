
public class RemoveDuplicateElement {
public static void main(String[] args) {
	int arr[]= {22,44,44,55,4,1,2,3,44,5,6,7,8,99,8,7};
	
	for(int i=0; i<arr.length; i++) {
		int j;
		for( j=0; i<arr.length; j++) {
			if(arr[i]==arr[j]) {
				break;
			}
		}
		if(i==j) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
}
