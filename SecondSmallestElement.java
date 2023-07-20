
public class SecondSmallestElement 
{

     public static void main(String args[])
{
      int temp;
      int num[] = {5, 1, 3, 4, 2}; 
      int lenght = num.length;
      for(int i = 0; i<lenght; i++ )
      	{
         for(int j = i+1; j<lenght; j++)
         {
            if(num[i]>num[j])
            	{
               temp = num[i];
               num[i] = num[j];
               num[j] = temp;
            	}
         }
      }
      System.out.println("2nd Smallest element of the num is: "+num[1]);
   }
}