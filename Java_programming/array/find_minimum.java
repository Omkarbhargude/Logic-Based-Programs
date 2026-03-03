//Find the minimum element in the array

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

    public int find_minimum()
    {
        if(Arr.length < 2)
        {
            return 0;
        }
        int iMin = Arr[0], i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(iMin > Arr[i])
            {
                iMin = Arr[i];
            }
        }
        return iMin;
    }
}

class find_minimum
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int iLen = sobj.nextInt();

        Solution aobj = new Solution(iLen);
        aobj.Accept();
        aobj.Display();

        int iRet = aobj.find_minimum();
        System.out.println("Minimum element from array is : "+iRet);

        sobj = null;
    }
}