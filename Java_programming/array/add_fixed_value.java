/*
    Problem Statement:
    Accept N numbers.
    Add 5 to every element and print new array.

    Sample Input:
    3
    5 15 22

    Sample Output:
    10 20 27

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

    public void Add_Value(int iVal)
    {
        if(Arr.length <= 0)
        {
            return;
        }
        
        int i = 0;
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = Arr[i] + iVal;
        }
    }
}

class add_fixed_value
{
    public static void main(String A[])
    {
        int iLen = 0, iTar = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        iLen = sobj.nextInt();

        Solution aobj = new Solution(iLen);
        aobj.Accept();

        System.out.println("Enter the new value to add in array : ");
        iTar = sobj.nextInt();
        
        aobj.Add_Value(iTar);

        aobj.Display();

        sobj = null;
    }
}