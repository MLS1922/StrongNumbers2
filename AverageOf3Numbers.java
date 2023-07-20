public class AverageOf3Numbers 
{

    public static void main(String[] args) {


	int[] numbers = new int[]{10,10,10};
	int sum = 0;

	for(int i=0; i < numbers.length ; i++)

	sum = sum + numbers[i]; 
	double average = sum / numbers.length;

	System.out.println("Average value of array elements is : " + average);

	} 
}


