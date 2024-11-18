package practicequestions;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3};
		int k =3 ;
		int length = arr.length;
		int result = 0;
		
	
	for (int i=0;i<length;i++) {
		int sum = 0;
		for(int j=i;j<length;j++) {
			sum = sum + arr[j];
			if(sum == k)
				result++;
		}
	}
	System.out.println("number of subarrays that sums upto "+k+" is:" +result);

	}
}
