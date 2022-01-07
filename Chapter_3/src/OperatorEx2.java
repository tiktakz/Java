public class OperatorEx2 {
    public static void main(String[] args) {
        //증감 연산자 ++i , i++ 차이

        // i값인 5를 먼저 입력하고 ++하기 때문에 j에는 5
        int i = 5, j = 6;
        j = i++;
        System.out.println("i는 " + i + " j는 " + j);

        //초기화

        // i에 ++ 한 값을 j에 저장하기 때문에 j는 6
        i = 5;
        j = 0;
        j = ++i;
        System.out.println("i는 " + i + " j는 " + j);
    }
}