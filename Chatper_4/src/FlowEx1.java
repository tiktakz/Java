import java.util.*;

class FlowEx1 {
    public static void main(String[] args){
        int input;
        System.out.print("숫자를 하나 입력하세요 >");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp); // 입력받은 문자열을 숫자로 변환

        if (input == 0) {
            System.out.println("입력한 문자는 숫자 0");
        }

        if (input != 0) {
            System.out.println("입력한 숫자는 0이 아님");
            System.out.printf("입력한 숫자는 %d ", input);
        }

        /* if ~ else 로 변경
        if (input == 0) {
            System.out.println("입력한 문자는 숫자 0");
        } else {
            System.out.println("입력한 숫자는 0이 아님");
        }
        */
    }
}
