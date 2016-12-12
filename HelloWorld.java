class data
{
    public:
    int a;
    int b;
};

class test
{
    public void testparam(int param1, String param2, )
    {
        param1=1;
        param2="123";
        System.out.println("a is " + param1 + ", b is " + param2);
    }
};


public class HelloWorld {
    
    public static void main(String []args) {
        int a=5;
        String b="678";
        test tt = new test();
        tt.testparam(a,b);
        System.out.println("a is " + a + ", b is " + b);
    }
}




