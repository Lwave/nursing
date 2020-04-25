package com.ssm.entity;

public class Dormitory {
    private Integer id;

    private Integer bedcount;

    private String roomnum;

    private Integer layernum;

    private String dormnum;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBedcount() {
        return bedcount;
    }

    public void setBedcount(Integer bedcount) {
        this.bedcount = bedcount;
    }

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum == null ? null : roomnum.trim();
    }

    public Integer getLayernum() {
        return layernum;
    }

    public void setLayernum(Integer layernum) {
        this.layernum = layernum;
    }

    public String getDormnum() {
        return dormnum;
    }

    public void setDormnum(String dormnum) {
        this.dormnum = dormnum == null ? null : dormnum.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "id=" + id +
                ", bedcount=" + bedcount +
                ", roomnum='" + roomnum + '\'' +
                ", layernum=" + layernum +
                ", dormnum='" + dormnum + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

}