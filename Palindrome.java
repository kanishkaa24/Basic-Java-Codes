import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int sum = 0;
	    int avg = 0;
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter count of numbers- ");  
        int count = sc.nextInt(); 
        for(int i = 1; i <= count; i++){  
            System.out.print("Enter number " + i + ": ");  
            int a = sc.nextInt();
            sum += a;
        } 
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + sum/count);
	}
}