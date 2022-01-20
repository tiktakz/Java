class ArrayEx1 {
    public static void main(String[] args) {
        int[] score = new int[5];

        for (int i=0; i<=4; i++) {
            score[i] = i*10;
        }
        // i<=4 처럼 하면 배열의 길이가 바뀌면 값도 바꿔줘야하기때문에
        // 상수(즉 배열의 길이 배열.length)를 사용하는 것이 좋다
        for (int i=0; i<score.length; i++){
            System.out.printf("score[%d]: %d%n", i, score[i]);
        }
    }
    
}
