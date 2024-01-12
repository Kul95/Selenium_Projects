public class Test {
    int a=10;
    static int b=20;
    public static void main(String[] args) {
        Test m=new Test();
        m.a=30;
        m.b=40;
        Test n=new Test();
        n.a=50;
        n.b=60;
        System.out.println(m.a);
        System.out.println(m.b);
        System.out.println(n.a);
        System.out.println(n.b);
    }
}
