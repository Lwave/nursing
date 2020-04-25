package com.ssm.util;

import com.ssm.entity.Dormitory;
import com.ssm.service.DormitoryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

@Component
public class Task implements Runnable {

/*    @Autowired
    @Qualifier("dormitoryService")
    private DormitoryService dormitoryService;*/

    int dormid;

    int count;
    ScheduledThreadPoolExecutor s;
    String email;
    String username;

    public Task() {

    }


    public Task(int dormid, ScheduledThreadPoolExecutor s, String email,String username) {
        this.dormid = dormid;
        this.s = s;
        this.email = email;
        this.username = username;
    }


    @Override
    public void run() {
        ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("applicationContext.xml");
        DormitoryService dormitoryService = (DormitoryService) cc.getBean("dormitoryService");
        Dormitory dormitory = dormitoryService.selectByPrimaryKey(dormid);
        count = dormitory.getBedcount();
        System.out.println("count:" + count);
        if (count > 0) {
            try {
                MailUtil.sendRetrieveMail(username,email, dormid);
            } catch (AddressException e) {
                e.printStackTrace();
            } catch (MessagingException e) {
                e.printStackTrace();
            }
          s.shutdown();
        }
    }


    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(task.count);
    }

}
