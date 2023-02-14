import java.util.Scanner;
import java.util.*;
 public class UC2 {
     public void Employeename() {
         System.out.println("enter a number");
         Scanner sc = new Scanner(System.in);
         sc.nextInt();
         int random = ((int) (Math.random() * 10) % 2 );
         int Employeenamepresent = 1;
         int Employeenameabsent = 0;
         if (random==Employeenamepresent) {
             System.out.println("Employeenamepresent");
         }
         else {
             System.out.println("Employeenameabsent");
         }
     }

    public static void main(String[] args) {
         UC2 u = new UC2();
         u.Employeename();
    }
    }
