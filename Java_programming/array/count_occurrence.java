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

class ArrayX
{
    public int Arr[];

    public ArrayX(int A)
    {
        this.Arr = new int[A];
    }

    public void Accept()
    {
        int i = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements in array : ");
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        sobj = null;
    }

    public void Display()
    {
        System.out.println("Elements of array are : ");
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

class Solution extends ArrayX
{
    public Solution(int iSize)
    {
        super(iSize);
    }

    public int Count_Occur(int iVal)
    {
        if(Arr.length <= 0)
        {
            return 0;
        }
        
        int i = 0, iCount = 0;
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == iVal)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class count_occurences
{
    public static void main(String A[])
    {
        int iLen = 0, iTar = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        iLen = sobj.nextInt();

        Solution aobj = new Solution(iLen);
        aobj.Accept();

        System.out.println("Enter the target number : ");
        iTar = sobj.nextInt();
        
        int iRet = aobj.Count_Occur(iTar);

        System.out.println(iTar+" appears "+iRet+" times in array");

        sobj = null;
    }
}