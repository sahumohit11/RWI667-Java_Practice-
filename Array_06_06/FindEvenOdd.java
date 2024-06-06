
public class FindEvenOdd {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,13,45,66};
		int even=0,odd=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("total even num:= "+even);
		System.out.println("total even num:= "+odd);

		
	}

}
