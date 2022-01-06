public class CastingEx1 {
    public static void main(String[] args) {
        //기본형 정수
        double d = 85.4;
        int score = (int)d;
        System.out.println(d);
        System.out.println(score);

        /*
          CastingEx2
        * 큰 값에서 작은값으로 변환 - loss of data 가능
        * 작은 값에서 큰 값으로 변환 - 데이터 손실 없음
        */
        
        // int to byte (큰값 -> 작은값) 변화있음
        int i = 10;
        byte b = (byte)i;
        System.out.printf("[int to byte] i=%d -> b=%d%n", i, b);
        
        int j = 300;
        byte k = (byte)j;
        System.out.printf("[int to byte] j=%d -> k=%d%n", j, k);

        // byte to int (작은값 -> 큰값) 변화없음
        b = 10;
        i = (int)b;
        System.out.printf("[byte to int] b=%d -> i=%d%n", b, i);

        b = -2;
        i = (int)b;
        System.out.printf("[byte to int] b=%d -> i=%d%n", b, i);
        }
}
