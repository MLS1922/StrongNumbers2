package main;
import java.util.Arrays;
public class CommonInAnArray 
{

    public static void main(String[] args) 
{
    
        int[] arr1 = {4,2,1,3,5,6};
        int[] arr2 = {4,2,2,7,8,9};
	
	System.out.println("The recurring numbers are: ");
	
			for (int i = 0; i < arr1.length; i++) 
			{
            for (int j = 0; j < arr2.length; j++) 
            {
                if (arr1[i] == arr2[j]) 
                {
					arr1.toString();
					System.out.println(arr1[i]+"");
					break;
				}
			}
		}
}
}

          