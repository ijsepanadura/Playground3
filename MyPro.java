import java.util.Scanner;

public class MyPro {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        assert (name.strip().length() == name.length()) && (name.length() >0) : "\033[31;1mYou have Entered an invalid Name\033[39;0m";

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        scanner.skip("\n");
        assert (18>age & age>10)&&(String.valueOf(age) != null) : "\033[31;1mYou have Entered an invalid Age\033[39;0m";
        
        String sub1;
        String sub2;
        String sub3;
        int mark1;
        int mark2;
        int mark3;
        
        System.out.print("Enter your subject-1 code : ");
        sub1 = scanner.nextLine();
        assert sub1.startsWith("SE-")&&
                (sub1.strip().length() == sub1.length())&&
                (sub1.length()>0):"\033[31;1mYou have Entered an invalid Subject\033[39;0m";
        
        
        System.out.printf("Enter your %s marks : ",sub1);
        mark1 = scanner.nextInt();
        scanner.skip("\n");
        assert (100>=mark1 & mark1>=0)&&(String.valueOf(mark1) != null) 
                    : "\033[31;1mYou have Entered an invalid Mark\033[39;0m";
        
        System.out.print("Enter your subject-2 code : ");
        sub2 = scanner.nextLine();
        assert sub2.startsWith("SE-")&&
                (sub2.strip().length() == sub2.length())&&
                (sub2.length()>0)&&
                (!sub2.equals(sub1))
                :"\033[31;1mYou have Entered an invalid Subject\033[39;0m";

        System.out.printf("Enter your %s marks : ",sub2);
        mark2 = scanner.nextInt();
        scanner.skip("\n");
        assert (100>=mark2 & mark2>=0)&&(String.valueOf(mark2) != null) 
                    : "\033[31;1mYou have Entered an invalid Mark\033[39;0m";

        System.out.print("Enter your subject-3 code :");
        sub3 = scanner.nextLine();
        assert sub3.startsWith("SE-")&&
                (sub3.strip().length() == sub3.length())&&
                (sub3.length()>0)&&
                (!sub3.equals(sub2) || !sub3.equals(sub1) )
                :"\033[31;1mYou have Entered an invalid Subject\033[39;0m";

        System.out.printf("Enter your %s marks : ",sub3);
        mark3 = scanner.nextInt();
        assert (100>=mark3 & mark3>=0)&&(String.valueOf(mark3) != null) 
                    : "\033[31;1mYou have Entered an invalid Mark\033[39;0m";
        


        
    }
}
