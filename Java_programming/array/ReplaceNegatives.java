/*  
    Problem Statement:
    Replace every negative number with 0 and print array.

    Sample Input:
    4
    -1 5 -3 0

    Sample Output:
    0 5 0 0
*/

import java.util.Scanner;

class ArrayOperations
{

    public void ReplaceNegative(int Arr[])
    {
        if(Arr.length <= 0)
        {
            return;
        }
        
        int i = 0, iCount = 0;
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] < 0)
            {
                Arr[i] = 0;
            }
        }
    }
}

class ReplaceNegative
{
    public static void main(String A[])
    {
        int iLen = 0, i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        iLen = sobj.nextInt();

        int Arr[] = new int[iLen];
        
        System.out.println("Enter "+iLen+" elements in array : ");
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayOperations aobj = new ArrayOperations();

        aobj.ReplaceNegative(Arr);

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }

    }
}