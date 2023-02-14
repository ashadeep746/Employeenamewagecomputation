public class UC6 {
    int hours=8;
   //int fullhours;
    int assumehours=100;
    int days=20;

    public int setFullhours(int hours,int days, int assumehours) {
        int fullhours=8*20%100;
        return fullhours;
    }
// public int getassumefullhours(int assumehours) {
    //    return assumehours;
// }
    public int  getfullhours(int fullhours) {
        return fullhours;
    }

    public static void main(String[] args) {
        UC6 u = new UC6();
        //System.out.println(u.getassumefullhours(100));
        System.out.print(u.getfullhours(1));
    }
}
