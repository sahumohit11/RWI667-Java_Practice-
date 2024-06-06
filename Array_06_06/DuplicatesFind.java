
public class DuplicatesFind {
public static void main(String[] args) {
	
	int arr[]= {55,2,1,55,6,7,88,9,88,7,6};
	
	for(int i=0;i<arr.length; i++) {
		int j;
		for ( j=i+1; j<arr.length; j++) {
			if(arr[i]==arr[j]) {
				System.out.print(arr[i]+" ");
				
			}
		}
		if(i==j) {
			break;
		}
	}
}
}
