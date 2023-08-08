import java.util.Scanner;

public class MyPro {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
   
        System.out.print("Enter your name : ");
        String name = scanner.nextLine(); // get name
        assert (name.strip().length() == name.length()) && (name.length() >0) : "\033[31;1mYou have Entered an invalid Name\033[39;0m";

        System.out.print("Enter your age : ");
        int age = scanner.nextInt(); // get age
        scanner.skip("\n");
        assert (18>age & age>10)&&(String.valueOf(age) != null) : "\033[31;1mYou have Entered an invalid Age\033[39;0m";
        
        String sub1; // declare subject name
        String sub2;
        String sub3;
        double mark1; // declare subject marks
        double mark2;
        double mark3;
        
        System.out.print("Enter your subject-1 code : ");
        sub1 = scanner.nextLine(); // get subject1 name
        assert sub1.startsWith("SE-")&&
                (sub1.strip().length() == sub1.length())&&
                (sub1.length()>0):"\033[31;1mYou have Entered an invalid Subject\033[39;0m";
        
        
        System.out.printf("Enter your %s marks : ",sub1);
        mark1 = scanner.nextDouble(); // get subject1 marks
        scanner.skip("\n");
        assert (100>=mark1 & mark1>=0)&&(String.valueOf(mark1) != null) 
                    : "\033[31;1mYou have Entered an invalid Mark\033[39;0m";
        
        System.out.print("Enter your subject-2 code : ");
        sub2 = scanner.nextLine();  // get subject2 name
        assert sub2.startsWith("SE-")&&
                (sub2.strip().length() == sub2.length())&&
                (sub2.length()>0)&&
                (!sub2.equals(sub1))
                :"\033[31;1mYou have Entered an invalid Subject\033[39;0m";

        System.out.printf("Enter your %s marks : ",sub2);
        mark2 = scanner.nextDouble();  // get subject2 marks
        scanner.skip("\n");
        assert (100>=mark2 & mark2>=0)&&(String.valueOf(mark2) != null) 
                    : "\033[31;1mYou have Entered an invalid Mark\033[39;0m";

        System.out.print("Enter your subject-3 code :");
        sub3 = scanner.nextLine(); // get subject3 name
        assert sub3.startsWith("SE-")&&
                (sub3.strip().length() == sub3.length())&&
                (sub3.length()>0)&&
                (!sub3.equals(sub2) & !sub3.equals(sub1) )
                :"\033[31;1mYou have Entered an invalid Subject\033[39;0m";

        System.out.printf("Enter your %s marks : ",sub3);
        mark3 = scanner.nextDouble();  // get subject3 marks
        assert (100>=mark3 & mark3>=0)&&(String.valueOf(mark3) != null) 
                    : "\033[31;1mYou have Entered an invalid Mark\033[39;0m";
        

       
        double total = mark1+ mark2+ mark3;
        double avg = total/3;

        String def = "\033[39;0m"; // default color

        String status;  // declare status
        String status1;
        String status2;
        String status3;

        String subj1 = sub1.substring(3);  // getting tail of subject name
        String subj2 = sub2.substring(3);
        String subj3 = sub3.substring(3);

        status1 = mark1>=75 ? "\033[32mDP" :(mark1>=65 ? "\033[33mCP" :(mark1>=55 ? "\033[34mP" : "\033[31mF"));
        status2 = mark2>=75 ? "\033[32mDP" :(mark2>=65 ? "\033[33mCP" :(mark2>=55 ? "\033[34mP" : "\033[31mF"));
        status3 = mark3>=75 ? "\033[32mDP" :(mark3>=65 ? "\033[33mCP" :(mark3>=55 ? "\033[34mP" : "\033[31mF"));
        status  = avg>=75 ? "\033[32;1mDP" :(avg>=65 ? "\033[33;1mCP" :(avg>=55 ? "\033[34;1mP" : "\033[31;1mF"));

        System.out.printf("%s\n","_".repeat(50));
        System.out.printf("| %-10s:\033[34;1m %-35s%s|\n","Name",name.toUpperCase(),def); //print name
        System.out.printf("| %-10s:\033[31;1m %-3s%s%-32s|\n","Age",age,def,"years old"); // print age
        System.out.printf("| %-10s: %-42s%s|\n","Status",status,def);                     // print status
        System.out.printf("| %-10s:\033[34;1m %-15.2f%s%-8s: %-6.2f%-4s|\n","Total",total,def,"Avg",avg,"%"); // print total marks & avg          
        System.out.printf("%s\n","-".repeat(50));
        System.out.printf("|  %-16s|  %-16s|  %-8s|\n","Subject","Marks","Status"); // print spec line
        System.out.printf("%s\n","-".repeat(50));
        System.out.printf("|  %4s%03d%9s|  %-15.2f | %-14s%s|\n",sub1.substring(0,3),Integer.valueOf(subj1)," ".repeat(9),mark1,status1,def);
        System.out.printf("|  %4s%03d%9s|  %-15.2f | %-14s%s|\n",sub2.substring(0,3),Integer.valueOf(subj2)," ".repeat(9),mark2,status2,def);
        System.out.printf("|  %4s%03d%9s|  %-15.2f | %-14s%s|\n",sub3.substring(0,3),Integer.valueOf(subj3)," ".repeat(9),mark3,status3,def);
        System.out.printf("%s\n","-".repeat(50));

        
    }
}
