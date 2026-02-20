/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package VU.vupay;

/**
 *
 * @author user
 */
 import java.util.Scanner;
public class VUCourses {



/**
 * Application: VUPay
 * Class: VUCourses
 */


    public static void main(String[] args) {
        // (b) Identifying and declaring variables
        String moduleCode;
        String moduleName = "";
        int tuition = 0;
        boolean isValid = true;

        // (c) Prompting user for input
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Victoria University Kampala Enrollment ---");
        System.out.print("Please enter the Module Code: ");
        moduleCode = input.nextLine().toUpperCase(); // Convert to uppercase for case-insensitivity

        // Logic to return course details based on ModuleCode
        switch (moduleCode) {
            case "BSF":
                moduleName = "BSc. Software Engineering";
                tuition = 900000;
                break;
            case "BIT":
                moduleName = "BSc. Information Technology";
                tuition = 750000;
                break;
            case "BCS":
                moduleName = "BSc. Computer Science";
                tuition = 800000;
                break;
            case "BCE":
                moduleName = "BSc. Computer Engineering";
                tuition = 950000;
                break;
            default:
                isValid = false;
        }

        // Output results
        if (isValid) {
            System.out.println("\n--- Course Details ---");
            System.out.println("Module Name: " + moduleName);
            System.out.println("Tuition Fees: UGX " + tuition);
        } else {
            System.out.println("Wrong Module Code details");
        }

        input.close();
    }
}
