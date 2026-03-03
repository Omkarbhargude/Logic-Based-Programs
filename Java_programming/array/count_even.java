//Problem Statement:
//Count how many even numbers are present in the array.

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

    public int count_even()
    {
        if(Arr.length <= 0)
        {
            return 0;
        }
        
        int i = 0, iCount = 0;
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] % 2 == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class count_even
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int iLen = sobj.nextInt();

        Solution aobj = new Solution(iLen);
        aobj.Accept();
        aobj.Display();

        int iRet = aobj.count_even();
        System.out.println("Number of even elements present in array are : "+iRet);

        sobj = null;
    }
}