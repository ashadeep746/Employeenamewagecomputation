public class UC1 {
    int hourEmployeewage;
    public int hourEmployeewage(int hourEmployeewage) {
        int assumeperhourEmployeewage = 20;
       hourEmployeewage = (60 * 20) % 8;
        return hourEmployeewage;
    }
    public int fullEmployeewage(int fullEmployeewage){
        int fullhours=8;
        fullEmployeewage=(8*20);
        return fullEmployeewage;
    }

    public static void main(String[] args) {
        UC1 i = new UC1();
        System.out.println(i);
    }
}
