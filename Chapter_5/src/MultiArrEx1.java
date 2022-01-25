import java.util.*;

class MultiArrEx1 {
    public static void main(String[] args) {
        // 입력한 좌표의 위치에 X 표시

        final int SIZE = 10;
        int x = 0, y=0;

        char[][] board = new char[SIZE][SIZE]; // 다차원 배열 board, 10X10 사이즈 생성
        byte[][] shipBoard = {
            // shipBoard판 생성
            //1, 2, 3, 4, 5, 6, 7, 8, 9
            { 0, 0, 0, 0, 0, 0, 1, 0, 0}, //1
            { 1, 1, 1, 1, 0, 0, 1, 0, 0}, //2
            { 0, 0, 0, 0, 0, 0, 1, 0, 0}, //3
            { 0, 0, 0, 0, 0, 0, 1, 0, 0}, //4
            { 0, 0, 0, 0, 0, 0, 0, 0, 0}, //5
            { 1, 1, 0, 1, 0, 0, 0, 0, 0}, //6
            { 0, 0, 0, 1, 0, 0, 0, 0, 0}, //7
            { 0, 0, 0, 1, 0, 0, 0, 0, 0}, //8 
            { 0, 0, 0, 0, 0, 1, 1, 1, 0}, //9
        }; 

        // board 배열에 값이 저장되어 있지 않음
        // 1행에 행번호, 1열에 행번호 저장
        // board는 char배열이기 때문에 '0' 을 더해줘서 숫자1을 문자 1로 변환

        for (int i=1; i<SIZE; i++){
            board[0][i] = board[i][0] = (char)(i+'0');
        }

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.printf("좌표를 입력하세요.(종료는 00)>");
            String input = scanner.nextLine();

            if (input.length() ==2){
                // 숫자를 문자로 바꾸기 위해서 -'0'
                x = input.charAt(0) -'0';
                y = input.charAt(1) -'0';

                if (x==0 && y==0){
                    break;
                }
            }

            if (input.length() !=2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE){
                System.out.println("올바른 숫자를 입력하세요!");
                continue;
            }
            // board가 shipBoard보다 1행1열 더 길기 때문에 -1
            board[x][y] = shipBoard[x-1][y-1] ==1 ? 'O' : 'X';

            for (int i=0; i<SIZE; i++) {
                System.out.println(board[i]);
            System.out.println();
            }
        }


    }    
}
