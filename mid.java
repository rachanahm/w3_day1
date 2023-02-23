 class mid {
	public static void main(String[] args) {
		int[] arr= {23,90,34,11,44,55};
		int[] arr2 = {23,90,34,11,44,55,99};
		if(arr.length%2==0) {
			int x=arr.length/2;
			System.out.println("mid elements are "+ arr[x-1]+" and "+arr[x]);
		}
		if(arr2.length%2!=0) {
			System.out.println("mid element is "+ arr2[arr2.length/2]);
		}
	}

}