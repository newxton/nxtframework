package com.newxton.nxtframework.entity;

import java.io.Serializable;

/**
 * (NxtProduct)实体类
 *
 * @author makejava
 * @since 2020-08-03 10:21:56
 */
public class NxtProduct implements Serializable {
    private static final long serialVersionUID = -96454045131933164L;
    
    private Long id;
    
    private Long categoryId;
    
    private String productName;

    private String productSubtitle;

    private Long price;

    private Integer priceNegotiation;

    private String priceRemark;
    
    private String productDescription;
    
    private Long datelineCreate;
    
    private Long datelineUpdated;
    
    private Integer isRecommend;

    private Long sortId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSubtitle() {
        return productSubtitle;
    }

    public void setProductSubtitle(String productSubtitle) {
        this.productSubtitle = productSubtitle;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getPriceNegotiation() {
        return priceNegotiation;
    }

    public void setPriceNegotiation(Integer priceNegotiation) {
        this.priceNegotiation = priceNegotiation;
    }

    public String getPriceRemark() {
        return priceRemark;
    }

    public void setPriceRemark(String priceRemark) {
        this.priceRemark = priceRemark;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Long getDatelineCreate() {
        return datelineCreate;
    }

    public void setDatelineCreate(Long datelineCreate) {
        this.datelineCreate = datelineCreate;
    }

    public Long getDatelineUpdated() {
        return datelineUpdated;
    }

    public void setDatelineUpdated(Long datelineUpdated) {
        this.datelineUpdated = datelineUpdated;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }
}