import java.util.*;

class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요 > ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while (num!=0){
            sum += num%10;
            System.out.printf("sum=%3d num=%d%n", sum, num);

            num /= 10;  // num을 10으로 나누면 마지막 한자리 제거. 다시 저장

        }
        System.out.println("각 자리수의 합: " +sum);
    }
}