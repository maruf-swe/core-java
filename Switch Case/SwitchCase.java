package switch_case;

public class SwitchCase {
    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("Matching in case 1");
                break;
            case 2:
                System.out.println("Matching in case 2");
                break;
            case 3:
                System.out.println("Matching in case 3");
                break;
            default:
                System.out.println("No matching");

        }
    }
}
