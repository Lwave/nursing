package com.ssm.test;

public class test5 {
    //反转
    //删除
    //是否为回文
    public static void main(String[] args) {
        test5 test5 = new test5();
        System.out.println(test5.reverse("123321"));
    }
    boolean reverse(String str){
        if (str == null){
            return false;
        }
        int length = str.length();
        for(int i = 0;i < length / 2;i++){
            if(str.charAt(i) != str.charAt(length - i -1) ){
                return false;
            }
        }
       // return new StringBuffer(str).reverse().toString();
        //return new StringBuffer(str).reverse().toString().equals(str);
        return  true;
    }
}
