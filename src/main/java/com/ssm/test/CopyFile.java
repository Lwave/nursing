package com.ssm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class CopyFile {
    //复制到个文件
    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        Boolean copy = copyFile.copy("E:/love.txt", "F:/love.txt");
        System.out.println(copy);

    }

    public Boolean copy(String oldPath, String newPath) {
        try {
            //字节总数
            int byteSum = 0;
            //读取字节
            int byteread = 0;
            File file = new File(oldPath);
            if (file.exists()) {
                //文件存在时
                InputStream inputStream = new FileInputStream(oldPath);
                FileOutputStream fs = new FileOutputStream(newPath);
                byte[] buffer = new byte[1444];
                int length;
                //inputStream.read(Buffer)！= -1
                // 表示从InputStream中读取一个数组的数据，如果返回-1 则表示数据读取完成了。
                while ((byteread = inputStream.read(buffer)) != -1) {
                    System.out.println("bbbbbbbbbb");
                    byteSum += byteread; //字节数文件大小
                    System.out.println("aaaaa"+byteSum);
                    fs.write(buffer, 0, byteread);
                }
                inputStream.close();
                return true;
            }

        } catch (Exception e) {
            System.out.println("复制单个文件操作出错");
            e.printStackTrace();
        }
        return false;
    }


}

