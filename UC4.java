
public class UC4 {
    int parttimework;

    public int UC4() {
        switch (parttimework) {
            case 1:
                parttimework = 8 * 20;
            default:
                System.out.println("null");
        }
        return 0;
    }

    public static void main(String[] args) {
        UC4 partime = new UC4();
        System.out.println(partime.UC4());
    }
}

