package com.ssm.entity;

import com.ssm.util.DateUtils;

import java.util.Date;

public class Notice {
    private Integer id;

    private String title;

    private String content;

    private Date notecreatedate;

    private String notecreatedateStr;

    public String getNotecreatedateStr() {
        if (notecreatedate != null) {
            notecreatedateStr = DateUtils.dateString1(notecreatedate, "yyyy-MM-dd HH:mm");
        }
        return notecreatedateStr;
    }

    public void setNotecreatedateStr(String notecreatedateStr) {
        this.notecreatedateStr = notecreatedateStr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getNotecreatedate() {
        return notecreatedate;
    }

    public void setNotecreatedate(Date notecreatedate) {
        this.notecreatedate = notecreatedate;
    }

    public Notice() {
    }

    public Notice(Integer id, String title, String content, Date notecreatedate, String notecreatedateStr) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.notecreatedate = notecreatedate;
        this.notecreatedateStr = notecreatedateStr;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", notecreatedate=" + notecreatedate +
                '}';
    }

}