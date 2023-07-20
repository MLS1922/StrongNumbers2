public class MaxAmongNumbers 
{

    public static void main(String[] args)
    	{
    	
    int i;
    int max=0;
    int a[] = {31,211,35};
    
    		for (i = 0; i<3; i++)
    		if(a[i]>max)
    				{
    					max=a[i];
    				}
    				{
    					System.out.println("The Maximum value :" +max);
    				}	
    	
    }
}
