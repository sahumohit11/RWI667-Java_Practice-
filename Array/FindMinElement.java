
public class FindMinElement {
public static void main(String[] args) {
	
int arr[]= {44,3,5,6,78,11,1,-2,-99};
int min=arr[0];
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	
			System.out.print("the smallest element is := "+min);
		
}
}

