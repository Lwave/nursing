package com.ssm.entity;

import java.util.Date;

public class User {

    private Integer id;

    private String username;

    private String password;

    private Integer gender;

    private Integer age;

    private String phone;

    private String email;

    private Date createdate;

    private Integer role;

    private Date birthday;

    private Integer uresp;

    private String salarycard;

    private String nation;

    private String idcard;

    private String nickname;

    private String address;

    private String realationtele;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getUresp() {
        return uresp;
    }

    public void setUresp(Integer uresp) {
        this.uresp = uresp;
    }

    public String getSalarycard() {
        return salarycard;
    }

    public void setSalarycard(String salarycard) {
        this.salarycard = salarycard == null ? null : salarycard.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRealationtele() {
        return realationtele;
    }

    public void setRealationtele(String realationtele) {
        this.realationtele = realationtele == null ? null : realationtele.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", createdate=" + createdate +
                ", role=" + role +
                ", birthday=" + birthday +
                ", uresp=" + uresp +
                ", salarycard='" + salarycard + '\'' +
                ", nation='" + nation + '\'' +
                ", idcard='" + idcard + '\'' +
                ", nickname='" + nickname + '\'' +
                ", address='" + address + '\'' +
                ", realationtele='" + realationtele + '\'' +
                '}';
    }
}