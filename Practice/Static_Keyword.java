package Practice;

public class Static_Keyword {


    static int staticVariable=10;

    int instanceVariable=20;

    static void staticMethod()
    {
        System.out.println("Calling Static method ");
    }
    static void staticMethod(int a)
    {
        System.out.println("Calling Overloaded Static method ");
    }
    void instanceMethod()
    {
        System.out.println("Calling instance method");
    }

    public static void main(String[] args) {
        Static_Keyword stat=new Static_Keyword();
        System.out.println(Static_Keyword.staticVariable);
        Static_Keyword.staticMethod();
        Static_Keyword.staticMethod(10);

        System.out.println(stat.instanceVariable);
        stat.instanceMethod();
    }

}
