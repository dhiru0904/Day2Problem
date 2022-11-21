package ForLoopStatement;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        int rev=0,rem;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter no: ");
        int no = d.nextInt();
        for(;no!=0;no=no/10){
            rem=no%10;
            rev=rev*10+rem;
        }
        System.out.println("The reverse no is:"+rev);
    }
}
