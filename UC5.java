public class UC5 {
    //assume 20 days work in month

    public int UC5(){
       int days=20;
       int month=30;
       int hour=20;
       int fullhour=8;
        fullhour = 8*20;
        int fullmonth;
        fullmonth=days*fullhour;
        return fullmonth;
    }

    public static void main(String[] args) {
        UC5 U = new UC5();
        System.out.println(U.UC5());
    }
}
