import java.util.Scanner;

public class SearchElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int arr[]= {1,2,3,4,55,55,4,3,2,1};
	int count=0;
	int a=0;
	System.out.println("Enter element to find: ");
	int find=sc.nextInt();
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i]==find) {
			count++;
			a=i;
			break;
		}
	}
	if(count!=0) {
		System.out.println("Element found at index of : = "+a);
	}
	else{
		System.out.println("Element found not! ");
	}
}
}
