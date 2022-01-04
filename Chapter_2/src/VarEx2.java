public class VarEx2 {
    // 값 교환하기
    public static void main (String[] args) {
        int x = 10, y = 20; //같은 타입이면 한줄에 가능
        int tmp = 0;

        // x의 값을 y와 바꾸기
        
        System.out.println("기존 x: " + x);
        System.out.println("기존 y: " + y);

        tmp = x; // tmp에 x의 값을 임시저장
        x = y;   // x 값에 y 할당
        y = tmp; // y 값에 x값을 저장한 tmp를 할당

        System.out.println("변경 x:" + x);
        System.out.println("변경 y:" + y);
        

    }
}