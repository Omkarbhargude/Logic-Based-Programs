//Problem Statement:
//Accept N numbers and one target number X.
//Print "Yes" if X is present, otherwise "No".

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

    public boolean Check_Exists(int iVal)
    {
        boolean bFlag = false;

        if(Arr.length <= 0)
        {
            return bFlag;
        }
        
        int i = 0;
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == iVal)
            {
                bFlag = true;
                break;
            }
        }
        return bFlag;
    }
}

class check_exists
{
    public static void main(String A[])
    {
        int iLen = 0, iTar = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        iLen = sobj.nextInt();

        Solution aobj = new Solution(iLen);
        aobj.Accept();

        System.out.println("Enter the number to want to check : ");
        iTar = sobj.nextInt();
        
        // aobj.Display();

        bRet = aobj.Check_Exists(iTar);

        if(bRet == true)
        {
            System.out.println(iTar+" exists in array");
        }
        else
        {
            System.out.println(iTar+" doesnt exists in array");
        }

        sobj = null;
    }
}