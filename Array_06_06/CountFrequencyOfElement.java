
public class CountFrequencyOfElement {
public static void main(String[] args) {
	int arr[]= {33,6,7,8,9,1,2,3,4,5,6,7,12,3,4,56,7};
	
       for(int i=0; i<arr.length; i++){
		   int count=0;

		 innerloop:for(int j=0;j<arr.length; j++){
                       for(int k=0; k<i; k++){
                            if(arr[k]==arr[i]){
                                 break innerloop;
                         	}
                       	}
			            if(arr[i]==arr[j]){
				           count++;
		        	    }
                  }
		 
             if(count>0){
                System.out.println(arr[i]+ " = "+count);
	          }
	
	    }
	
}
}
