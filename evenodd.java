class evenodd {  
  public static void main(String args[]){     
    int arr[]={23,45,12,90,55,33};  
    int EvenSum=0,OddSum=0;  
    for(int i=0;i<arr.length;i++){      
      if(arr[i] % 2 == 0)
			{
				EvenSum = EvenSum + arr[i]; 
			}
			else
			{
				OddSum = OddSum + arr[i]; 
			}
		}		
		System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
		System.out.println(" The Sum of Odd Numbers in this Array = " + OddSum);
	}
}