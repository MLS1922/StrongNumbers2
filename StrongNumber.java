//DANRUS S. MAGBANUA

public class StrongNumber 
{
	

    public static void main(String[] args)  
    	{
    		int n,x,r,sum,f,i;
    		
    		n=145;
    		x=n;
    		sum=0;
    		while(n!=0)
    		{
    			r= n%10;
    			System.out.println("nnnnn "+n);
    			f=1;
    			System.out.println("rrrrr "+r);
    			for(i=1; i<=r; i++)
    				
    			{
    				System.out.println(i);
    				f=f*i;
    				
    			}
    			
    			System.out.println(f);
    			sum=sum+f;
    			n = n/10;
    			System.out.println("sssssssss "+sum);
    		}
    	if(sum == x)
    		System.out.println(x + "\t is a Strong number");
    	else
    		System.out.println(x + "\t is not a Strong number");
    		
   
    	}
}




















