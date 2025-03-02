package ClassQues;

import java.sql.SQLOutput;

public class WrapperEx {
    public static void main(String[] args) {
        //boxing
        int a=10;
        Integer b=a;
        //unboxing
        int c=b;
        String d="100";
        int e=Integer.parseInt(d);//yahan pehel string to Integer then unboxing to int;If I had written Integer e - it would have been treated as an object and stored in heap memory
        System.out.println(e);
        String f="123";
        Integer asd=Integer.valueOf(f);
        //here writing int asd will throw an error because valueOf returns a wrapperObject
        System.out.println(asd);

        //bitwise operations
        System.out.println(Integer.toBinaryString(23));
        System.out.println(Integer.bitCount(23));
        System.out.println(Integer.toHexString(23));
        System.out.println(Integer.toOctalString(23));


        int m=10;
        int n=10;
        System.out.println(m==n);
        String s1="hii";
        String s2="hii";
        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2));//true
        String s3=new String("Hii");
        String s4=new String("Hii");
        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4));//true
        System.out.println(10+20+"java"+30+40);

    }
}
