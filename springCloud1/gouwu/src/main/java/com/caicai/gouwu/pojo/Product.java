package com.caicai.gouwu.pojo;

public class Product {
    private Integer id;
    private String productName;
    private String introduction;
    private Double price;
    private String detail;
    private Integer resourceId;
    private Integer videoId;
    private Integer looknum;
    private String language;
    private String tag;
    private String database;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getLooknum() {
        return looknum;
    }


    public void setLooknum(Integer looknum) {
        this.looknum = looknum;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", introduction='" + introduction + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                ", resourceId=" + resourceId +
                ", videoId=" + videoId +
                ", looknum=" + looknum +
                ", language='" + language + '\'' +
                ", tag='" + tag + '\'' +
                ", database='" + database + '\'' +
                '}';
    }
}
