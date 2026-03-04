/*  
    Problem Statement:
    Accept N numbers and target X.
    Count how many times X appears.

    Sample Input:
    6
    5 2 5 1 5 3
    5

    Calculation:
    5 appears 3 times

    Sample Output:
    3

*/

import java.util.Scanner;

class ArrayOperations
{

    public int SumEvenIndex(int Arr[])
    {
        if(Arr.length <= 0)
        {
            return 0;
        }
        
        int i = 0, iCount = 0;
        for(i = 0; i < Arr.length; i+=2)
        {
            iCount = iCount + Arr[i];
        }
        return iCount;
    }
}

class SumEvenIndices
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

        int iRet = aobj.SumEvenIndex(Arr);

        System.out.println("Summation of even indexed is : "+iRet);
    }
}