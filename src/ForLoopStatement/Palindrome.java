package ForLoopStatement;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int temp,sum,rem;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter no: ");
        int no=d.nextInt();
        temp=no;
        for(sum=0;no>0;no/=10)
        {
            rem=no%10;
            sum=(sum*10)+rem;
        }
        if (sum==temp)
        {
            System.out.println("no is palindrome");
        }
        else
        {
            System.out.println("No is not palindrome");
        }
}}
