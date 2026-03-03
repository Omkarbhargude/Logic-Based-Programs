//Problem Statement:
//Accept N numbers.
//Calculate and print the sum of all numbers.

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

    public int sum_array_elements()
    {
        if(Arr.length <= 0)
        {
            return 0;
        }
        
        int i = 0, iSum = 0;
        for(i = 0; i < Arr.length; i++)
        {
            iSum = iSum + Arr[i];
        }
        return iSum;
    }
}

class sum_array_elements
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int iLen = sobj.nextInt();

        Solution aobj = new Solution(iLen);
        aobj.Accept();
        aobj.Display();

        int iRet = aobj.sum_array_elements();
        System.out.println("Summation of array elements is : "+iRet);

        sobj = null;
    }
}