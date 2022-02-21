package com.gourianova.binocularvision.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class App{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int id;
    private String title;
    private boolean inRent;
    private int typeId;
    private int HttpAddressesId;
    private BigDecimal pricePerHour;
    private String web_shop;
    private String location;
    private String picture;
    private String url;

    public App() {
    }

    public App(int id, String title, boolean inRent, int typeId, int HttpAddressesId, BigDecimal pricePerHour, String web_shop, String location, String picture) {
        this.id = id;
        this.title = title;
        this.inRent = inRent;
        this.typeId = typeId;
        this.HttpAddressesId = HttpAddressesId;
        this.pricePerHour = pricePerHour;
        this.web_shop = web_shop;
        this.location = location;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isInRent() {
        return inRent;
    }

    public void setInRent(boolean inRent) {
        this.inRent = inRent;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getHttpAddressesId() {
        return HttpAddressesId;
    }

    public void setHttpAddressesId(int HttpAddressesId) {
        this.HttpAddressesId = HttpAddressesId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BigDecimal getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(BigDecimal pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public String getWeb_shop() {
        return web_shop;
    }

    public void setWeb_shop(String web_shop) {
        this.web_shop = web_shop;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof App)) return false;
        App app = (App) o;
        return getId() == app.getId() &&
                isInRent() == app.isInRent() &&
                getTypeId() == app.getTypeId() &&
                getHttpAddressesId() == app.getHttpAddressesId() &&
                //     Objects.equals(getType(), app.getType()) &&
                Objects.equals(getPricePerHour(), app.getPricePerHour()) &&
                Objects.equals(getWeb_shop(), app.getWeb_shop()) &&
                Objects.equals(getLocation(), app.getLocation()) &&
                Objects.equals(getPicture(), app.getPicture());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), isInRent(), getTypeId(), getHttpAddressesId(), getPricePerHour(), getWeb_shop(), getLocation(), getPicture());
    }

    @Override
    public String toString() {
        return "App{" +
                "id=" + id +
                ", title=" + title +
                ", inRent=" + inRent +
                ", typeId=" + typeId +
                ", HttpAddressesId=" + HttpAddressesId +
                ", pricePerHour=" + pricePerHour +
                ",web_shop='" + web_shop + '\'' +
                ", location='" + location + '\'' +
                ", picture='" + picture + '\'' +
                "} " + super.toString();
    }
}
