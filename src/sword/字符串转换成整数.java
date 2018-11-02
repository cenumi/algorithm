package sword;

public class 字符串转换成整数 {
    /**
     * 将一个字符串转换成一个整数
     * (实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
     * 要求不能使用字符串转换整数的库函数。
     * 数值为0或者字符串不是一个合法的数值则返回0。
     */

    public static void main(String[] args) {
        System.out.println(new 字符串转换成整数().StrToInt("123456"));
    }

    public int StrToInt(String str) {
        if (str == null ||  str.length() == 0)
            return 0;
        char[] chs = str.toCharArray();
        int sum = 0;
        int i = 0;
        int a = 1;
        if (chs[0] == '-') {
            a = -1;
            i = 1;
        } else if (chs[0] == '+'){
            a = 1;
            i = 1;
        }

        for (; i < chs.length; i++) {
            if (chs[i] > '9' || chs[i] < '0')
                return 0;
            sum = sum*10 + chs[i]-'0';
        }
        return sum * a;

    }
}
