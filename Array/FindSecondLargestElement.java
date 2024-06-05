import java.util.Scanner;

public class FindSecondLargestElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int arr[]=new int[5];
	System.out.println("Enter the elements in array: ");
	for(int i=0; i<arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	int max=0;
	int max2nd=0;
	
	for(int i=0; i<arr.length; i++) {
		max=arr[i];
		if(max>max2nd) {
			max2nd=max;
			System.out.println("The second greatest element in array:= "+max2nd);
		}
	}
	System.out.println("The second greatest element in array:= "+max2nd);
	
}
}
