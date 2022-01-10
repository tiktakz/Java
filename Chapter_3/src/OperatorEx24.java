public class OperatorEx24 {
    public static void main(String[] args) {
        int x = 0;
        char ch = ' ';

        x = 15;
        System.out.printf("x=%2d일때, 10 < x && x < 20 = %b%n", x, 10 < x && x < 20);

        x = 6;
        System.out.printf("x=%2d일때, x%%2==0 || x%%3==0 && x%%6!=0 = %b%n", x, x%2==0||x%3==0&&x%6!=0);

        ch = '1';
        System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' = %b%n", ch, '0' <= ch && ch <= '9');
    }
}
