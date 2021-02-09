package com.hello.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * City generated by hbm2java
 */
@Entity
@Table(name = "city",
         catalog = "senior_app",
         uniqueConstraints = {
            @UniqueConstraint(columnNames = "name_ar")
            , @UniqueConstraint(columnNames = "name_en")}
)
public class City implements java.io.Serializable {

    private Integer id;
    private String nameAr;
    private String nameEn;

    @JsonBackReference(value = "user-movement")
    private Set<Area> areas = new HashSet<Area>();

    @JsonBackReference
    private Set<Foundation> foundation = new HashSet<Foundation>();

    @JsonBackReference(value = "userr-movement")
    private Set<Orders> orders = new HashSet<Orders>();

    public City() {
    }

    public City(String nameAr, String nameEn) {
        this.nameAr = nameAr;
        this.nameEn = nameEn;
    }

    public City(String nameAr, String nameEn, Set<Area> areas) {
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.areas = areas;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name_ar", unique = true, nullable = false, length = 100)
    public String getNameAr() {
        return this.nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    @Column(name = "name_en", unique = true, nullable = false, length = 45)
    public String getNameEn() {
        return this.nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city", cascade = CascadeType.ALL)
    public Set<Area> getAreas() {
        return this.areas;
    }

    public void setAreas(Set<Area> areas) {
        this.areas = areas;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city", cascade = CascadeType.ALL)
    public Set<Foundation> getFoundation() {
        return this.foundation;
    }

    public void setFoundation(Set<Foundation> foundation) {
        this.foundation = foundation;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city", cascade = CascadeType.ALL)
    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

}
