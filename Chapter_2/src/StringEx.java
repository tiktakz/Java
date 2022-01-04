public class StringEx {
    public static void main (String[] args) {
        String name =  new String ("GilDong"); 
        /* String은 클래스이기 때문에 새로운 객체를 생성하기 위해서는
        new String 형식으로 해야되지만 특별한 경우로 
        String name = "GilDong"; 형식도 가능하다*/
        //String test = "Ja" + "Va";
        String str = name + 8;
        //String str_1 = name + test;
        String str_2 = name + str;
        System.out.println(name); 
        System.out.println(str_2);
        System.out.println(" "+7);
        System.out.println(" " + " ");
    }
}
