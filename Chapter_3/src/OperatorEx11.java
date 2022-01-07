public class OperatorEx11 {
    public static void main(String[] args) {
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';
        int number = (char)(two - zero);
        int result = (char)d - a;
        System.out.printf("'%c' - '%c' = %d%n", d, a, d - a);
        System.out.println(result);
        System.out.println(number);
        byte b = 30;
        byte c = 50;
        byte byteSum = (byte)(b*c);
        System.out.println(byteSum);

        int num1 = 700;
        int num2 = 300;
        int resultNum = num1 + num2;
        System.out.println(resultNum);




        /*
        문자 '2' 를 숫자로 바꾸려면 문자 '0'을 빼주면 됨.
        그렇게 되면 '2' - '0' = 50 - 48 = 2
        문자 'd' 에서 'a' 를 빼면 숫자로 나옴
        'd' - 'a' = 100 - 97 = 3
        숫자는 0, 문자는 a
        */

    }
}
