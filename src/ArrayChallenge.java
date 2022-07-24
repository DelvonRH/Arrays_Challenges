import java.util.Arrays;

public class ArrayChallenge 
{

	public static void main(String[] args) 
	{
		int [] numberArray = new int [20];
		
		for(int i = 0; i < numberArray.length; i++)
		{
			numberArray[i] = (int) (Math.random() * 10);
		}
		
		
		System.out.println(Arrays.toString(numberArray));
		System.out.println("The sum of the values is: " + sumOfArray(numberArray));
		
	}
	
	public static int sumOfArray(int [] num)
	{
		int sumOfNumbers = 0;
		
		for(int numbers : num)
		{
			sumOfNumbers = sumOfNumbers + numbers;
		}
		
		return sumOfNumbers;
	}

}
