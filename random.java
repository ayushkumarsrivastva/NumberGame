import java.util.*;
import java.io.*;

class random
{
    public static void main(String args[]) throws InterruptedException
    {
        Scanner sc =new Scanner(System.in);

        int a =(int)(Math.random()*100);
       int num;
       System.out.println("guess your number in");
       System.out.println("3");
       Thread.sleep(1000);
       System.out.println("2");
       Thread.sleep(1000);
       System.out.println("1");
       Thread.sleep(1000);
       System.out.println("guess your number :\n");

       do
       {
        num=sc.nextInt();
       
       if(num ==a)
       {
        System.out.println("whoooo!!!! found");
        break;
       }
       if(num > a)
       {
           System.out.println("too large");

       }
       if(num <a)
       {
           System.out.println("too small");

       }
    }while(num>0);
    }
}