/*
 * This file is generated by jOOQ.
 */
package com.doteadore.recruitment_backend.codegen.tables.pojos;


import com.doteadore.recruitment_backend.codegen.tables.interfaces.IJoboffer;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Joboffer implements IJoboffer {

    private static final long serialVersionUID = -1551434017;

    private Integer       id;
    private String        company;
    private Integer       professiontype;
    private String        title;
    private String        description;
    private Integer       isdeleted;
    private LocalDateTime starttime;
    private String        city;
    private LocalDateTime endtime;
    private Integer       position;

    public Joboffer() {}

    public Joboffer(IJoboffer value) {
        this.id = value.getId();
        this.company = value.getCompany();
        this.professiontype = value.getProfessiontype();
        this.title = value.getTitle();
        this.description = value.getDescription();
        this.isdeleted = value.getIsdeleted();
        this.starttime = value.getStarttime();
        this.city = value.getCity();
        this.endtime = value.getEndtime();
        this.position = value.getPosition();
    }

    public Joboffer(
        Integer       id,
        String        company,
        Integer       professiontype,
        String        title,
        String        description,
        Integer       isdeleted,
        LocalDateTime starttime,
        String        city,
        LocalDateTime endtime,
        Integer       position
    ) {
        this.id = id;
        this.company = company;
        this.professiontype = professiontype;
        this.title = title;
        this.description = description;
        this.isdeleted = isdeleted;
        this.starttime = starttime;
        this.city = city;
        this.endtime = endtime;
        this.position = position;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getCompany() {
        return this.company;
    }

    @Override
    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public Integer getProfessiontype() {
        return this.professiontype;
    }

    @Override
    public void setProfessiontype(Integer professiontype) {
        this.professiontype = professiontype;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Integer getIsdeleted() {
        return this.isdeleted;
    }

    @Override
    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    @Override
    public LocalDateTime getStarttime() {
        return this.starttime;
    }

    @Override
    public void setStarttime(LocalDateTime starttime) {
        this.starttime = starttime;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public LocalDateTime getEndtime() {
        return this.endtime;
    }

    @Override
    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }

    @Override
    public Integer getPosition() {
        return this.position;
    }

    @Override
    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Joboffer (");

        sb.append(id);
        sb.append(", ").append(company);
        sb.append(", ").append(professiontype);
        sb.append(", ").append(title);
        sb.append(", ").append(description);
        sb.append(", ").append(isdeleted);
        sb.append(", ").append(starttime);
        sb.append(", ").append(city);
        sb.append(", ").append(endtime);
        sb.append(", ").append(position);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IJoboffer from) {
        setId(from.getId());
        setCompany(from.getCompany());
        setProfessiontype(from.getProfessiontype());
        setTitle(from.getTitle());
        setDescription(from.getDescription());
        setIsdeleted(from.getIsdeleted());
        setStarttime(from.getStarttime());
        setCity(from.getCity());
        setEndtime(from.getEndtime());
        setPosition(from.getPosition());
    }

    @Override
    public <E extends IJoboffer> E into(E into) {
        into.from(this);
        return into;
    }
}
