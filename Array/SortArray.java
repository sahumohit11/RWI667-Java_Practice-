
public class SortArray {
public static void main(String[] args) {
	int arr[]= {1,2,33,44,5,6,77,888,9,1,2,34,0};
	
	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
}
}
