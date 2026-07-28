import java.util.Scanner;

public class BusPassManagement {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        System.out.println("===== BUS PASS MANAGEMENT =====");
        System.out.println("1. Apply Bus Pass");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");

int choice = sc.nextInt();
sc.nextLine();
if (choice == 1) {
}
 else if (choice == 2) {

    System.out.println("Thank You!");
    sc.close();
    return;

} else {

    System.out.println("Invalid Choice!");
    sc.close();
    return;
}
        System.out.println("===== BUS PASS MANAGEMENT SYSTEM =====");
     
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        String busPassNo = "BP" + id;

        System.out.println("Bus Pass Number: " + busPassNo);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        sc.nextLine();

       System.out.print("Enter Bus Route: ");
       String route = sc.nextLine();

       System.out.print("Enter Distance (km): ");
       int distance = sc.nextInt();
       sc.nextLine();
       System.out.print("Enter Payment Mode (Cash / UPI / Card): ");
       String paymentMode = sc.nextLine();

int fee;

if (distance <= 10) {
    fee = 500;
} else if (distance <= 20) {
    fee = 1000;
} else {
    fee = 1500;
}
String status = "Approved";
String expiryDate = " 31-07-2028";
String issueDate = "25-6-2025";
        System.out.println("\n----- Student Details -----");
        System.out.println("Bus Pass Number: " + busPassNo);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobile);
        System.out.println("Department: " + dept);
        System.out.println("Year: " + year);
        System.out.println("Bus Route: " + route);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Payment Mode: " + paymentMode);
        System.out.println("Bus Fee: ₹" + fee);
        System.out.println("Status: " + status);
        System.out.println("Issue Date:" + issueDate);
        System.out.println("Expriy Date:" + expiryDate);

        sc.close();
    }
}