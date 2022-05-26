package array;

public class two_dimention_array 
{
public static void main(String[] args)
{
	int [][] oriArr = { {10,20,30},{40,50,60}};
	
	int row = oriArr.length;
	int column = oriArr[0].length;
	
	System.out.println("Original Array:");
	
	for (int i = 0; i < row; i++)
	{
        for (int j = 0; j < column; j++)
        {
            System.out.print(oriArr[i][j]+" ");
        }
        System.out.println();
}
	
	System.out.println("After changing the rows and colums of the said array:");
	
	for (int i = 0; i < column; i++)
	{
        for (int j = 0; j < row; j++)
        {
            System.out.print(oriArr[j][i]+" ");
        }
        System.out.println();
}
}
}
