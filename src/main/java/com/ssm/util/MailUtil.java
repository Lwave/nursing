package com.ssm.util;


import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailUtil {
    //ctrl + shfit + o
    public static void sendRetrieveMail(String username,String email, int dormid) throws AddressException, MessagingException {
        System.out.println("准备发邮件");
        // 配置发送邮件的环境属性
        final Properties props = new Properties();
        // 表示SMTP发送邮件，需要进行身份验证
        props.put("mail.smtp.auth", "true");
        //邮件服务器地址--发件人
        props.put("mail.smtp.host", "smtp.qq.com");
        // 发件人的账号
        props.put("mail.smtp.username", "1367203302@qq.com");
        // 访问SMTP服务时需要提供的密码，163邮箱中客户端授权密码
        props.put("mail.smtp.password", "dkinjsaghikfbaec");

        // 构建授权信息，用于进行SMTP进行身份验证
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                // 用户名、密码
                String userName = props.getProperty("mail.smtp.username");
                String password = props.getProperty("mail.smtp.password");
                return new PasswordAuthentication(userName, password);
            }
        };
        // 使用环境属性和授权信息，创建邮件会话,
        Session mailSession = Session.getInstance(props, authenticator);
        // 创建邮件消息
        MimeMessage message = new MimeMessage(mailSession);
        // 设置发件人
        InternetAddress form = new InternetAddress(props.getProperty("mail.smtp.username"));
        message.setFrom(form);

        // 设置收件人
        InternetAddress to = new InternetAddress(email);
        message.setRecipient(MimeMessage.RecipientType.TO, to);

        // 设置邮件标题
        message.setSubject("养老院管理系统重要通知");

        // 设置邮件的内容体
        //product.do?flag=onePro&pid=?&proName=?
        // String url = "http://localhost:8080/JavaWeb";
        message.setContent("您好,"+username +":<br>您订的床位有了，欢迎订购啊!", "text/html;charset=UTF-8");

        // 发送邮件
        Transport.send(message);
        System.out.println("邮件发送完成");
    }


}

