class ArrayEx17 {
    public static void main(String[] args) {
        // CLI을 통해 입력값을 전달받기

        if (args.length != 3) {
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        char op = args[2].charAt(0);
        int result = 0;

        switch(op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default :
                System.out.println("지원되지 않는 연산입니다");
        }

        System.out.println("Result : " + result);
    }
}
