/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package groups.leapmonths;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class LeapMonths {





    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = input.nextInt();

        boolean isLeapMonth;

        isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (year % 100 != 0);
        isLeapMonth = isLeapMonth || (year % 400 == 0);

        if (isLeapMonth) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        input.close();
    }
}
