package com.neusoft.sample.GreenDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "XTCSGJ".
 */
public class XTCSGJ {

    private Long id;
    private String test_group_number;
    private String user_id;
    private String IsDoSubject;
    private String IsGJ;
    private Integer time;
    private java.util.Date testtime;
    private String tableName;

    public XTCSGJ() {
    }

    public XTCSGJ(Long id) {
        this.id = id;
    }

    public XTCSGJ(Long id, String test_group_number, String user_id, String IsDoSubject, String IsGJ, Integer time, java.util.Date testtime, String tableName) {
        this.id = id;
        this.test_group_number = test_group_number;
        this.user_id = user_id;
        this.IsDoSubject = IsDoSubject;
        this.IsGJ = IsGJ;
        this.time = time;
        this.testtime = testtime;
        this.tableName = tableName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTest_group_number() {
        return test_group_number;
    }

    public void setTest_group_number(String test_group_number) {
        this.test_group_number = test_group_number;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getIsDoSubject() {
        return IsDoSubject;
    }

    public void setIsDoSubject(String IsDoSubject) {
        this.IsDoSubject = IsDoSubject;
    }

    public String getIsGJ() {
        return IsGJ;
    }

    public void setIsGJ(String IsGJ) {
        this.IsGJ = IsGJ;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public java.util.Date getTesttime() {
        return testtime;
    }

    public void setTesttime(java.util.Date testtime) {
        this.testtime = testtime;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

}