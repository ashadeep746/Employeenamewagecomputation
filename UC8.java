public class UC8 {
     public int UC8() {
          String company = "google";
          int days = 100;
          int hour = 8;
          int hourwage = 20;
          int fullhourwage = (20 * 8) * 100;
          return fullhourwage;
     }

     public int UC81() {
          String company1 = "meta";
          int days = 100;
          int hour = 8;
          int hourwage = 20;
          int fullhourwage = (20 * 8) * 100;
          return fullhourwage;
     }

     public static void main(String[] args) {
          UC8 u = new UC8();
          UC8 UC81 = new UC8();
          System.out.println(u.UC8());
          System.out.println(UC81.UC8());
     }
}
