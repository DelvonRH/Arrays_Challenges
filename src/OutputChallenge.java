
public class OutputChallenge 
{

	public static void main(String[] args) 
	{
		double[ ] examplesArray = {1,5,6,5,4,1};

        
		double maximum = examplesArray[0];

        int index = 0;

        for (int i = 1; i< examplesArray.length; i++){

             if (examplesArray[ i ] > maximum) {

                  maximum = examplesArray[ i ];

                  index = i;

             }

        }

        System.out.println(index);


	}

}
