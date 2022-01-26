class Tv {
    // Tv인스턴스를 만들기 위한 클래스
    // Tv속성(멤버속성)
    String color;
    boolean power;
    int channel;

    // Tv기능(메소드)
    void power() { power = !power; }
    void channelUp() {  ++channel; }
    void channelDown() { --channel; }
}

class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel 값은 " + t1.channel + " 입니다");
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다");

        t2 = t1; // t1값을 t2에 할당
        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경");

        System.out.println("t1의 channel 값은 " + t1.channel + " 입니다");
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다");


    }
}