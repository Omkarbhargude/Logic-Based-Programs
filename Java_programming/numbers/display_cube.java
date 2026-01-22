// write program which accepts one number and prints cube of that number 

import java.util.Scanner;

class display_cube
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        System.out.println("cube of given number is : "+(iNo * iNo * iNo));
    }
}