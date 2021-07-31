package 数据;

public class 赋值及其扩展
{
    int a = 3;
    int b = 4;

    public  void m()
    {
        a+=b;
        System.out.println("a="+a+"\nb="+b);
        a *= b+3;
        //a=a*(b+3)
        System.out.println("a="+a);

    }
}
