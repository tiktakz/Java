public class VarEx1 {
    // Ch2 변수선언
    public static void main (String[] args){
        int a = 3;
        int b = 4;
        //int d;  Garabage Value
        System.out.println(a);
        System.out.println(b);
        // System.out.println(d); Initialize 필요함


        // 문자형 char은 내부적으로 정수로 저장
        // 그렇기 때문에 y 는 65 출력
        char x = 'A';
        int y = x;
        System.out.println(y); // 65


    }   
    
}
