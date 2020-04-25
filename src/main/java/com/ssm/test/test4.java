package com.ssm.test;

public class test4 {
    public static void main(String[] args) {
        String s = new test4().removeChar("123", '1');
        System.out.println(s);
    }
    String removeChar(String str,char c){
        if(str == null){
            return null;
        }
        return str.replace(Character.toString(c),"");
    }

}
