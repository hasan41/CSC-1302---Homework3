/*Hasan Naseer
 * Homework 04
 * October 14,2018
 */
import java.util.Scanner;
public class starString {
	public static void Stringstar(int n) {
		for(int i=0; i<Math.pow(2, n); i++) { 
			if(n < 0) {
				System.out.println("Type a number above 0");
			}
			else {
				System.out.print("*");

			}
		}
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter an Integer :");
        int n =s.nextInt();
        Stringstar(n); //prints out astrisk(s)
        System.out.print("\n");
        if(n<0) {
			System.out.print("");
	}
        else {
            System.out.print("Because " + 2 + "^" + n + "=" + Math.pow(2, n)); // Just some extra work which shows that 2^n = answer

        }
	}
}
