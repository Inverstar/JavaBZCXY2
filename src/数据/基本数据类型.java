package 数据;

import java.math.BigDecimal;

import static java.lang.Math.pow;

/**
 * @author verstar
 * primitive data type
 */
public class 基本数据类型
{
    // reference data type
    // 引用数据类型四个字节，存储引用对象的地址
    public static void main(String[] args)
    {
        // byte 1 short 2
        // int  4 long  8
        //float 4 double 8
        byte b = -128;
        byte e = 127;
        short s = -32768;
        short t = 32767;
        int i = -2147483648;
        int nt = (int) pow(2,31);
        long l = 343 ;
        //在int范围内,21亿
        long g = 222222222222222L;
        //加L或l
        System.out.println(b);
        System.out.println(e);
        System.out.println(s);
        System.out.println(t);
        System.out.println(i);
        System.out.println(nt);

        int c = 041;
        int d = 0x15;
        int f = 0b11;
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);

        float 有效数字7 = 3.4443213E2f;
        double 双精度 = 342.234;
        BigDecimal 金融 = BigDecimal.valueOf(3423.3244);
        float f1 = 0.1f;
        double d1 = 1.0/10;
        System.out.println(f1==d1);
        //浮点数不精确, 避免直接比较
        float f2 = 2342425435f;
        float f3 = f2+1;
        System.out.println(f2==f3);

        char eChar = 'a';
        char cChar = '中';
        char u0000 = '\u0000';
        char uFFFF = '\u0061';
        System.out.println(u0000);
        System.out.println(uFFFF);

        String str = "我爱中国";
        System.out.println("ab\\c\nd\"");
        //转义字符

        boolean t1 = true;
        boolean f4 = false;
        //查看字节的函数
        System.out.println(str.length());
        //boolean 单独使用当作int, 4个字节
        //boolean数组 当作byte数组处理, 1个字节

    }
}
