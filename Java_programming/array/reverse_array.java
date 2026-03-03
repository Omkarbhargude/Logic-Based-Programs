//Problem Statement:
//Accept N numbers.
//Print the array in reverse order.

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

    public void reverse_array()
    {
        if(Arr.length <= 0)
        {
            return;
        }
        int i = 0, iTemp = 0, iend = Arr.length-1;

        while(i < iend)
        {
            iTemp = Arr[iend];
            Arr[iend] = Arr[i];
            Arr[i] = iTemp;
            i++;
            iend--;
        }

        System.out.println("Array after reversal : ");

        for(i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
}

class reverse_array
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int iLen = sobj.nextInt();

        Solution aobj = new Solution(iLen);
        aobj.Accept();
        aobj.Display();

        aobj.reverse_array();

        sobj = null;
    }
}