class PrintfEx1 {
    public static void main(String[] args) {
        // 변수의 값을 다양한 형태로 출력
        int age = 14;
        int year = 2022;
        char letter = 'A';

        System.out.println(age);
        System.out.printf("age : %d%n", age);
        System.out.printf("year : %d%n", year);
        System.out.printf("letter = %c %d%n", letter, (int)letter);

        int space = 100;
        System.out.printf("space = [%5d]%n", space); // 5자리 , 빈 공간 왼쪽
        System.out.printf("space = [%05d]%n", space); // 빈자리에 0을 채우고 총 5자리
        System.out.printf("space = [%-5d]%n", space); // 5자리, 빈공간 오른쪽
    }

}