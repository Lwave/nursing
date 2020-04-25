package com.ssm.test;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test6 {
    public static void main(String[] args) {
        Cookie cookie = new Cookie("username", "111");
        cookie.setMaxAge(10);
        String value1 = cookie.getValue();
        System.out.println(value1);
        HashMap<String, Integer> result = new HashMap<>();
        result.put("1",1);
        result.put("1",1);
        result.put("1",3);
        result.put("4",1);
        result.put("5",1);
        Iterator<Map.Entry<String, Integer>> it = result.entrySet().iterator();
      while (it.hasNext()){
          Map.Entry<String, Integer> entry = it.next();
          String key = entry.getKey();
          Integer value = entry.getValue();
          System.out.println(key+"="+value);

      }
    }
}
