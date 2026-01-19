// write a program which accepts a number and check whether it is divisible by 3 and 5

import java.util.Scanner;

class check_divisible
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        if((iNo % 3 == 0) && (iNo % 5 == 0))
        {
            System.out.println(iNo+" is divisible by 3 and 5");
        }
        else
        {
            System.out.println(iNo+" is not divisible by 3 and 5");
        }
    }
}