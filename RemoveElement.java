package main;
import java.util.Arrays;
public class RemoveElement 

{
    public static void main(String[] args)
    {
    
    
    int[] arr1 = {1,2,3,3,4,3,3,5};
    int arr2 = 3;
    
    for (int i = 0; i < arr1.length; i++) 
			
			{
				if(arr2==arr1[i])
				{
					continue;
				}
    		System.out.println(arr1[i]+" ");
    		
    		}
    
    }
}