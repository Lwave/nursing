package com.ssm.entity;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Information {
    private Integer id;

    private String title;

    private Date createtime;

    private String pic;

    private String content;

    private String createtimeStr;


    public String getCreatetimeStr() {
        if(createtime != null){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            createtimeStr = sdf.format(createtime);
        }
        return createtimeStr;
    }

    public void setCreatetimeStr(String createtimeStr) {
        this.createtimeStr = createtimeStr;
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "Information{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", createtime=" + createtime +
                ", pic='" + pic + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}