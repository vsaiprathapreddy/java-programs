import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter the number :");
        int n= reader.nextInt();

        String evenodd = (n%2 == 0)?"even" : "odd";

        System.out.println(n+" is " + evenodd);
    }
}