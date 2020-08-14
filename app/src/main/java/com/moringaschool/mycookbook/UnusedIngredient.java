
package com.moringaschool.mycookbook;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UnusedIngredient {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("unitLong")
    @Expose
    private String unitLong;
    @SerializedName("unitShort")
    @Expose
    private String unitShort;
    @SerializedName("aisle")
    @Expose
    private String aisle;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("original")
    @Expose
    private String original;
    @SerializedName("originalString")
    @Expose
    private String originalString;
    @SerializedName("originalName")
    @Expose
    private String originalName;
    @SerializedName("metaInformation")
    @Expose
    private List<Object> metaInformation = null;
    @SerializedName("meta")
    @Expose
    private List<Object> meta = null;
    @SerializedName("image")
    @Expose
    private String image;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UnusedIngredient() {
    }

    /**
     * 
     * @param image
     * @param amount
     * @param original
     * @param unitLong
     * @param aisle
     * @param originalName
     * @param unit
     * @param unitShort
     * @param meta
     * @param name
     * @param originalString
     * @param id
     * @param metaInformation
     */
    public UnusedIngredient(Integer id, Double amount, String unit, String unitLong, String unitShort, String aisle, String name, String original, String originalString, String originalName, List<Object> metaInformation, List<Object> meta, String image) {
        super();
        this.id = id;
        this.amount = amount;
        this.unit = unit;
        this.unitLong = unitLong;
        this.unitShort = unitShort;
        this.aisle = aisle;
        this.name = name;
        this.original = original;
        this.originalString = originalString;
        this.originalName = originalName;
        this.metaInformation = metaInformation;
        this.meta = meta;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitLong() {
        return unitLong;
    }

    public void setUnitLong(String unitLong) {
        this.unitLong = unitLong;
    }

    public String getUnitShort() {
        return unitShort;
    }

    public void setUnitShort(String unitShort) {
        this.unitShort = unitShort;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getOriginalString() {
        return originalString;
    }

    public void setOriginalString(String originalString) {
        this.originalString = originalString;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public List<Object> getMetaInformation() {
        return metaInformation;
    }

    public void setMetaInformation(List<Object> metaInformation) {
        this.metaInformation = metaInformation;
    }

    public List<Object> getMeta() {
        return meta;
    }

    public void setMeta(List<Object> meta) {
        this.meta = meta;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
