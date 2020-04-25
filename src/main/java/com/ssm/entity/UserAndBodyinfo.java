package com.ssm.entity;

import java.util.Date;

public class UserAndBodyinfo {

    private Integer id;

    private Integer uid;

    private Integer weight;

    private String cold;

    private String bodyattent;

    private String chronic;

    private String urine;

    private String shit;

    private String symptom;

    private Integer tightness;

    private String medhistory;



    private String username;

    private String password;

    private Integer gender;

    private Integer age;

    private String phone;

    private String email;

    private Date birthday;

    private Date createdate;

    private Integer role;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getCold() {
        return cold;
    }

    public void setCold(String cold) {
        this.cold = cold == null ? null : cold.trim();
    }

    public String getBodyattent() {
        return bodyattent;
    }

    public void setBodyattent(String bodyattent) {
        this.bodyattent = bodyattent == null ? null : bodyattent.trim();
    }

    public String getChronic() {
        return chronic;
    }

    public void setChronic(String chronic) {
        this.chronic = chronic == null ? null : chronic.trim();
    }

    public String getUrine() {
        return urine;
    }

    public void setUrine(String urine) {
        this.urine = urine == null ? null : urine.trim();
    }

    public String getShit() {
        return shit;
    }

    public void setShit(String shit) {
        this.shit = shit == null ? null : shit.trim();
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom == null ? null : symptom.trim();
    }

    public Integer getTightness() {
        return tightness;
    }

    public void setTightness(Integer tightness) {
        this.tightness = tightness;
    }

    public String getMedhistory() {
        return medhistory;
    }

    public void setMedhistory(String medhistory) {
        this.medhistory = medhistory == null ? null : medhistory.trim();
    }

    @Override
    public String toString() {
        return "UserAndBodyinfo{" +
                "id=" + id +
                ", uid=" + uid +
                ", weight=" + weight +
                ", cold='" + cold + '\'' +
                ", bodyattent='" + bodyattent + '\'' +
                ", chronic='" + chronic + '\'' +
                ", urine='" + urine + '\'' +
                ", shit='" + shit + '\'' +
                ", symptom='" + symptom + '\'' +
                ", tightness=" + tightness +
                ", medhistory='" + medhistory + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                ", createdate=" + createdate +
                ", role=" + role +
                '}';
    }
}
