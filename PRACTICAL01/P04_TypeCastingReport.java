package PRACTICAL01;

public class P04_TypeCastingReport {
    public static void main(String[] args) {
        int val1 = 4;
        long val2 = val1;
        double val3 = val2;
        System.out.println("turned int---->\n" + val1 + " long----->\n" + val2 + " double\n" + val3);

        char ch = 'A'; 
        int code = ch;
        int rupee = 12;
        float money = rupee;
        System.out.println("char----------> int: " + code + " int----->float: " + money); // Fix 2: Print transformed variables

        int a = 4;
        int b = 9;
        System.out.println(a / b);
        System.out.println((double) a / b); 
    }
}
