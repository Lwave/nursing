package com.ssm.test;

public class Test7 {
    public static void main(String[] args) {
        //在一段字符串中挑出其中的数字打印.如String="a1b2"，只打印12
        String str = "a1b2";
        StringBuffer buffer = new StringBuffer(str);
        char c1 = buffer.charAt(1);
        char c = buffer.charAt(3);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(c1);
        stringBuffer.append(c);
        System.out.println(stringBuffer.toString());

        for (int i = 0; i < str.length() ; i++){
             char ch = str.charAt(i);
             if (ch > '0' && ch < '9'){
                 System.out.print(ch);
             }
        }
    }
}
