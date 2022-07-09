public class Question_3_java {
    public static void main(String[] args) {

        int a = 2,b = 3,c = 4, d = 5;
        float g = 4.0f,k = 4.3f;

        System.out.println( "--b*a+c*d-- :" + (--b) * a + c * (d--));
        System.out.println("a++ :" + (a++));
        System.out.println("(–2) * ( g – k ) +c :" + (-2) * (g-k) + c);
        System.out.println("c=c++ :" + (c++));
        System.out.println("c=++c*a++ :" + (++c)*(a++));
    }
}
