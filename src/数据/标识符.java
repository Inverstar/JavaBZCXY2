
package 数据;
/**
 * 标识符用于给变量\类\方法\包进行命名
 * 使用驼峰规则命名
 * 类名首字母大写| 方法变量首字母小写
 * @author verstar
 * @version 1.0
 */
public class 标识符
{
     /*
    标识符   字母 下划线 美元符号 开头 , 和数字组合 (汉字也可开头)
    *标识符    大小写敏感, 无长度限制
    *标识符    不能是关键字
    */
     public static void main(String[] args /*参数名称, 可变*/)
    {
        System.out.println("这是一个标识符类");
    }
    int abc = 12;
    int 年龄 = 18;
    int $s = 22;
    int _y = 33;
    //    int 123adb =3; //数字不能作为标识符开头
}
// Java通常采用Unicode这样的国际字符集而不是ASCII字符集