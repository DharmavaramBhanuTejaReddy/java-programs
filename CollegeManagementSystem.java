import java.util.Scanner;
public class CollegeManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] students=new String[10];
        String[] teachers=new String[10];
        int sCount=0,tCount=0,choice;
        do {
            System.out.println("===== College Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Teacher");
            System.out.println("4. View Teachers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    if(sCount<10) {
                        System.out.print("Enter Student Name: ");
                        students[sCount]=sc.nextLine();
                        sCount++;
                        System.out.println("Student added!");
                    } else System.out.println("Limit reached!");
                    break;
                case 2:
                    if(sCount==0) System.out.println("No students found!");
                    else {
                        System.out.println("--- Students List ---");
                        for(int i=0;i<sCount;i++) System.out.println((i+1)+". "+students[i]);
                    }
                    break;
                case 3:
                    if(tCount<10) {
                        System.out.print("Enter Teacher Name: ");
                        teachers[tCount]=sc.nextLine();
                        tCount++;
                        System.out.println("Teacher added!");
                    } else System.out.println("Limit reached!");
                    break;
                case 4:
                    if(tCount==0) System.out.println("No teachers found!");
                    else {
                        System.out.println("--- Teachers List ---");
                        for(int i=0;i<tCount;i++) System.out.println((i+1)+". "+teachers[i]);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice!=5);
        sc.close();
    }
}
