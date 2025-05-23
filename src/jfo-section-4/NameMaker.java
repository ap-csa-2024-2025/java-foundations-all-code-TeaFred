
import javax.swing.JOptionPane;
import java.util.Scanner;
public class NameMaker {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String myname = sc.nextLine();
        System.out.println("Please enter your age and grade level: ");
        int age = sc.nextInt();
        int  gradelevel = sc.nextInt();
        System.out.println("Please enter how much money you have: ");
        double money = sc.nextDouble();
        String message = String.format("Hello %s, %n you are %d years old and in grade %d. %n You have %2.2f dollars.", myname, age, gradelevel,money);
        System.out.println(message);

    }
    
}
