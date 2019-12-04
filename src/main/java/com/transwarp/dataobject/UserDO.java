package com.transwarp.dataobject;

import java.io.Serializable;
import java.util.Date;

public class UserDO implements Serializable {
    private Long member_id;
    private String gender;
    private Integer age;
    private String city;
    private String name;
    private Long phone;
    private Date registration_date;

    public Long getMember_id() {
        return member_id;
    }

    public void setMember_id(Long member_id) {
        this.member_id = member_id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Date getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "member_id=" + member_id +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", registration_date=" + registration_date +
                '}';
    }
}
