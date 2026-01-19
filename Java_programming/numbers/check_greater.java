// write a function which accepts two number and print the greater number 

import java.util.Scanner;

class check_greater
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter numbers : ");
        iValue1 = sobj.nextInt();
        iValue2 = sobj.nextInt();

        if(iValue1 > iValue2)
        {
            System.out.println(iValue1+" is greater then "+iValue2);
        }
        else
        {
            System.out.println(iValue2+" is greater then "+iValue1);
        }

    }
}