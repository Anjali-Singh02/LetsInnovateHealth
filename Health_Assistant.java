import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Health_Assistant {
    public static void main(String[] args) {
// Scanner class to take input from user
        Scanner sc = new Scanner(System.in);
// name of a person
        String name = "SUNITA SHARMA";
// Current date and time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
        LocalDateTime now = LocalDateTime.now();
        String str = dtf.format(now);
// converting time into integer i.e taking only hour
        int hhInNum = Integer.parseInt(str);
// incrementing check to display right content according to time
        int check = -1;
        if (hhInNum >= 0 && hhInNum < 6) {
            System.out.println("It's Midnight Please Go back to Sleep.\nGood night Sweet Dreams😴");
            return;     // program exits if it's midnight
        } else if (hhInNum >= 6 && hhInNum <= 11) {
            System.out.println("\nHi!\nGood Morning Miss " + name + "!...\nThis is your Personal assistant.\n Please select the option given below...");
            check = 0;
        } else if (hhInNum >= 12 && hhInNum <= 17) {
            System.out.println("\nHi!\nGood Afternoon Miss " + name + "!...\nThis is your Personal assistant.\nPlease select the option given below...");
            check = 1;
        } else if (hhInNum >= 18 && hhInNum <= 23) {
            System.out.println("\nHi!\nGood Evening Miss " + name + "!...\nThis is your Personal assistant.\n Please select the option given below...");
            check = 2;
        }
// Options to be displayed
        System.out.println("\n1:-Medicine Reminder\n2:-Your Daily Routine\n3:- 9 Steps To Stay Healthy");
        System.out.print("Enter Your Choice:- ");
        int ch = sc.nextInt();

        if (ch == 1) {
            if (check == 0) {
                System.out.print("Did You have Breakfast?(Yes/No) :- ");
                char ans = sc.next().charAt(0);
                if (ans == 'Y' || ans == 'y')  {
                    System.out.println("That's great" + " Miss " + name + "/n Please Take Your Medicines Too");
                } else {
                    System.out.println(
                            "Please Have Your Breakfast First And Don't Forget To Take Your Morning Medicines...");
                }
            } else if (check == 1) {
                System.out.print("Did You have Lunch?(Yes/No) :- ");
                char ans = sc.next().charAt(0);
                if (ans == 'Y' || ans == 'y') {
                    System.out.println("That's great" + " Miss " + name + "/n Please Take Your Medicines Also");
                } else {
                    System.out.println(
                            "Please Have Your Lunch First And Don't Forget To Take Your Afternoon Medicines...");
                }
            } else if (check == 2) {
                System.out.print("Did You have Dinner?(Yes/No) :- ");
                char ans = sc.next().charAt(0);
                if (ans == 'Y' || ans == 'y') {
                    System.out.println("That's great" + " Miss " + name + "/n Please Take Your Medicines!");
                } else {
                    System.out.println(
                            "Please Have Your Dinner And Please Don't Forget To Take Your Evening Medicines...");
                }
            }
//  Daily Routine Chart
        } else if (ch == 2) {
            System.out.println("\n6AM          : WAKE UP");
            System.out.println("6AM - 7AM    : FRESHEN UP ");
            System.out.println("7AM - 7:30AM : WALKING ");
            System.out.println("7:30AM - 8AM : REST ");
            System.out.println("8AM-10AM     : BREAKFAST AND FAMILY TIME ");
            System.out.println("10AM-12PM    : LISTEN DEVOTIONAL SONG ");
            System.out.println("12PM-1PM     : TAKE A NAP ");
            System.out.println("1PM-2PM      : LUNCH");
            System.out.println("2PM-4PM      : REST WHILE LISTENING MUSIC ");
            System.out.println("4PM-5PM      : FAMILY TIME");
            System.out.println("5PM-6PM      : SNACKS ");
            System.out.println("6PM-7PM      : PRAY TO GOD ");
            System.out.println("7PM-8PM      : DINNER");
            System.out.println("8PM - 9PM    : FAMILY TIME");
            System.out.println("9PM          : BED TIME");

//    Your Current Activity
            if (hhInNum == 6) {
                System.out.println("\nYour Current Activity is : TO GET OUT OF BED");
            } else if (hhInNum == 7) {
                System.out.println("\nYour Current Activity is : WALKING OR REST");
            } else if (hhInNum == 8) {
                System.out.println("\nYour Current Activity is : TO HAVE YOUR BREAKFAST, MEDICINE AND FAMILY TIME ");
            } else if (hhInNum == 10) {
                System.out.println("\nYour Current Activity is : TO LISTEN BHAJAN");
            } else if (hhInNum == 12) {
                System.out.println("\nYour Current Activity is : TO TAKE A NAP");
            } else if (hhInNum == 1) {
                System.out.println("\nYour Current Activity is : LUNCH TIME");
            } else if (hhInNum == 14) {
                System.out.println("\nYour Current Activity is : TO REST WHILE LISTENING MUSIC ");
            } else if (hhInNum == 16) {
                System.out.println("\nYour Current Activity is : TO ENJOY FAMILY TIME ");
            } else if (hhInNum == 17) {
                System.out.println("\nYour Current Activity is : TO HAVE SNACKS");
            } else if (hhInNum == 18) {
                System.out.println("\nYour Current Activity is : TO PRAY TO GOD ");
            } else if (hhInNum == 19) {
                System.out.println("\nYour Current Activity is : TO HAVE DINNER AND MEDICINE ");
            } else if (hhInNum == 20) {
                System.out.println("\nYour Current Activity is : FAMILY TIME ");
            } else if (hhInNum == 21) {
                System.out.println("\nYour Current Activity is : TIME TO GO TO SLEEP ");
            }
        }
//  9 Steps to stay healthy
        else if (ch == 3) {
            System.out.println("1 : Get Active");
            System.out.println("2 : Take Supplements as Necessary");
            System.out.println("3 : Eat a Healthy Diet");
            System.out.println("4 : Wash Your Hands Frequently");
            System.out.println("5 : Learn How To Manage Stress");
            System.out.println("6 : Get Plenty Of Sleep");
            System.out.println("7 : Take Steps To Prevent Infections");
            System.out.println("8 : Schedule Annual Physical");
            System.out.println("9 : Avoid Contact With People Who Are Sick");
        }
// greetings while exiting app
        if (hhInNum >= 00 && hhInNum <= 11) {
            System.out.println("\nBye!\nHave a nice day! \nSee you next time.\n");
        } else if (hhInNum >= 12 && hhInNum <= 17) {
            System.out.println("\nBye!\nHave a wonderful day!...\nSee you next time.\n");
        } else if (hhInNum >= 18 && hhInNum <= 23) {
            System.out.println("\nBye!\nGood night!...\nSee you in morning!.\n");
        }

    }
}