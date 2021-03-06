package com.angus.topdemo.entities;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;

/**
 * Entity mapped to table "TOP".
 */
public class Top {

    @JSONField(name = "id")
    @SerializedName("id")
    private Long id;
    @SerializedName("title")
    private String title;
    @SerializedName("img")
    private String img;
    @SerializedName("description")
    private String description;
    @SerializedName("keywords")
    private String keywords;
    @SerializedName("message")
    private String message;
    @SerializedName("fromname")
    private String fromname;
    @SerializedName("fromurl")
    private String fromurl;
    @SerializedName("topclass")
    private Long topclass;
    @SerializedName("count")
    private Integer count;
    @SerializedName("fcount")
    private Integer fcount;
    @SerializedName("rcount")
    private Integer rcount;
    @SerializedName("time")
    private java.util.Date time;

    public Top() {
    }

    public Top(Long id) {
        this.id = id;
    }

    public Top(Long id, String title, String img, String description, String keywords, String message, String fromname, String fromurl, Long topclass, Integer count, Integer fcount, Integer rcount, java.util.Date time) {
        this.id = id;
        this.title = title;
        this.img = img;
        this.description = description;
        this.keywords = keywords;
        this.message = message;
        this.fromname = fromname;
        this.fromurl = fromurl;
        this.topclass = topclass;
        this.count = count;
        this.fcount = fcount;
        this.rcount = rcount;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFromname() {
        return fromname;
    }

    public void setFromname(String fromname) {
        this.fromname = fromname;
    }

    public String getFromurl() {
        return fromurl;
    }

    public void setFromurl(String fromurl) {
        this.fromurl = fromurl;
    }

    public Long getTopclass() {
        return topclass;
    }

    public void setTopclass(Long topclass) {
        this.topclass = topclass;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getFcount() {
        return fcount;
    }

    public void setFcount(Integer fcount) {
        this.fcount = fcount;
    }

    public Integer getRcount() {
        return rcount;
    }

    public void setRcount(Integer rcount) {
        this.rcount = rcount;
    }

    public java.util.Date getTime() {
        return time;
    }

    public void setTime(java.util.Date time) {
        this.time = time;
    }

}
