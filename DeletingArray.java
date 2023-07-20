
public class DeletingArray 
{

    public static void main(String[] args) 
    	
    	{
    		
    		int[] arr1 = {4,2,1,3,5,3,3,2,6};
        	int	arr2 = 3;
        	 
	
        	for (int i = 0; i < arr1.length; i++)
        	{
    		if (arr2 == arr1[i])
    		{
    			continue;
    		
    			
    		}
    		System.out.println(""+arr1[i]);
			}
    	}
}