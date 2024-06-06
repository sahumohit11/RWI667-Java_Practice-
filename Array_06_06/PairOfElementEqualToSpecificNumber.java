
public class PairOfElementEqualToSpecificNumber {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int num=8;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==num) {
				System.out.println("the pair is equals to number:= "+"{"+arr[i]+" and "+arr[j]+"}");
			}
		}
	}
}
}
