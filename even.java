// WAP to print even number of a given array.
class even
  {  
  public static void main(String args[]){     
    int arr[]={23,45,12,90,55,33};      
    System.out.println("number of elements: "+arr.length);     
    for(int i=0;i<arr.length;i++){      
      if(arr[i]%2==0){          
        System.out.print(arr[i]+" ");        
      }          
    }       
  }}