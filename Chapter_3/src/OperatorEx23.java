public class OperatorEx23 {
    public static void main(String[] args) {
        // 문자열 비교
        // equals() Method 사용
        // str1, str2 비교 할 때 false 나올 수 있기 때문
        String str1 = "ABC";
        String str2 = new String("ABC");
        String str3 = "aBc";
        String str4 = "ABC";

        // equalsIgnoreCase - 대소문자 구분 없이 비교

        System.out.printf("str1 == str2 ?: %b%n", str1 == str2); // false, str2와 str1은 문자열은 같아도 객체가 다름
        System.out.printf("str1 == str3 ?: %b%n", str1 == str3);
        System.out.printf("str2 == str3 ?: %b%n", str2 == str3);
        System.out.printf("str1 == str4 ?: %b%n", str1 == str4);
        System.out.printf("str1.equals(str2) ?: %b%n", str1.equals(str2));
        System.out.printf("str1.equals(str3) ?: %b%n", str1.equals(str3)); // false
        System.out.printf("str1.equalsIgnoreCase(str2) ?: %b%n", str1.equalsIgnoreCase(str2));
        System.out.printf("str1.equals(str4) ?: %b%n", str1.equals(str4));
    }
    
}