package java005_method;

public class Java063_method {
	public static void main(String[] args) {
		int[] num = new int[] {5,2,8,7,4};
		System.out.printf("최대값 : %d\n",max(num)); //최대값 : 8
		System.out.printf("최소값 : %d\n",min(num)); //최소값 : 2
		System.out.printf("배열의 크기 : %d\n",size(num)); //배열의 크기 : 5
	} // end main
	
	//최대값
	public static int max(int[] arr) {
		int max=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i] > max)
				max = arr[i]; } // end i
		return max;
	} // end max;
	
	//최소값
	public static int min(int[] arr) {
		int min= max(arr);
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i] < min)
				min = arr[i]; } // end i
		return min;
	} // end min;
	
	
	//배열의 크기
	public static int size(int[] arr) {
		return arr.length;
	} // end size;
}
