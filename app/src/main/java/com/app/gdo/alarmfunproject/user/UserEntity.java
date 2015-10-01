package com.app.gdo.alarmfunproject.user;

/**
 * Created by laptop88 on 7/26/2015.
 */
public class UserEntity {

    private String userName;
    private String userRole;
    private String userGroup;
    private String userMobile;
    private String userPhone;
    private String userEmail;
    private String userAddress;
    private String userSlack;


    public UserEntity() {
    }

    public UserEntity(String name, String role, String group, String mobile, String phone, String email, String address, String slack) {
        this.userName = name;
        this.userRole = role;
        this.userGroup = group;
        this.userMobile = mobile;
        this.userPhone = phone;
        this.userEmail = email;
        this.userAddress = address;
        this.userSlack = slack;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserSlack() {
        return userSlack;
    }

    public void setUserSlack(String userSlack) {
        this.userSlack = userSlack;
    }
}
