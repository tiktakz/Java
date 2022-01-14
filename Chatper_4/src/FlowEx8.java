import java.util.*;

class FlowEx8 {
    public static void main(String[] args) {
        System.out.println("주민번호를 입력하세요 > ");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        char gender = num.charAt(7);

        switch (gender) {
            case '1': case '3':
                System.out.println("당신은 남자");
                break;
            case '2': case '4':
                System.out.println("당신은 여자");
                break;
            default:
                System.out.println("유효하지 않은 주민번호");
        }
    }
}
