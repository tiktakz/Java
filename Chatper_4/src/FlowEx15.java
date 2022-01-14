class FlowEx15 {
    public static void main(String[] args) {
        System.out.println("i \t 2*i \t i*i");
        System.out.println("---------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d \t %d \t %d%n", i, 2*i, i*i);
        }
    }
}
