package com.neusoft.sample.GreenDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "XTCTJL".
 */
public class XTCTJL implements Comparable<XTCTJL> {

    private Long id;
    private Integer xtcsjl_id;
    private String answer;
    private java.util.Date jl_datetime;
    private String xtdctm_id;
    private String tableName;

    public XTCTJL() {
    }

    public XTCTJL(Long id) {
        this.id = id;
    }

    public XTCTJL(Long id, Integer xtcsjl_id, String answer, java.util.Date jl_datetime, String xtdctm_id, String tableName) {
        this.id = id;
        this.xtcsjl_id = xtcsjl_id;
        this.answer = answer;
        this.jl_datetime = jl_datetime;
        this.xtdctm_id = xtdctm_id;
        this.tableName = tableName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getXtcsjl_id() {
        return xtcsjl_id;
    }

    public void setXtcsjl_id(Integer xtcsjl_id) {
        this.xtcsjl_id = xtcsjl_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public java.util.Date getJl_datetime() {
        return jl_datetime;
    }

    public void setJl_datetime(java.util.Date jl_datetime) {
        this.jl_datetime = jl_datetime;
    }

    public String getXtdctm_id() {
        return xtdctm_id;
    }

    public void setXtdctm_id(String xtdctm_id) {
        this.xtdctm_id = xtdctm_id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    @Override
    public int compareTo(XTCTJL another) {
        if (Integer.valueOf(xtdctm_id.substring(9)).intValue()<Integer.valueOf(another.xtdctm_id.substring(9)).intValue())return -1;
        else  if (Integer.valueOf(xtdctm_id.substring(9)).intValue()==Integer.valueOf(another.xtdctm_id.substring(9)).intValue())return 0;
        else return 1;
    }
}