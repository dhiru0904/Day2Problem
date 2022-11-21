package ForLoopStatement;

import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        int i,sum=0;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter no:---");
        int no=d.nextInt();
        for(i=0;i<=no;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of natural no is: "+sum);
    }
}
