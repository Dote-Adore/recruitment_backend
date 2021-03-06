/*
 * This file is generated by jOOQ.
 */
package com.doteadore.recruitment_backend.codegen.tables.pojos;


import com.doteadore.recruitment_backend.codegen.tables.interfaces.IHomepushapplication;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Homepushapplication implements IHomepushapplication {

    private static final long serialVersionUID = -1074726495;

    private Integer       id;
    private String        companyid;
    private LocalDateTime endtime;
    private String        handleadminid;
    private LocalDateTime handletime;
    private Integer       handleres;
    private String        handleresponsecontent;
    private Integer       hasreadbycompany;
    private Integer       jobofferid;

    public Homepushapplication() {}

    public Homepushapplication(IHomepushapplication value) {
        this.id = value.getId();
        this.companyid = value.getCompanyid();
        this.endtime = value.getEndtime();
        this.handleadminid = value.getHandleadminid();
        this.handletime = value.getHandletime();
        this.handleres = value.getHandleres();
        this.handleresponsecontent = value.getHandleresponsecontent();
        this.hasreadbycompany = value.getHasreadbycompany();
        this.jobofferid = value.getJobofferid();
    }

    public Homepushapplication(
        Integer       id,
        String        companyid,
        LocalDateTime endtime,
        String        handleadminid,
        LocalDateTime handletime,
        Integer       handleres,
        String        handleresponsecontent,
        Integer       hasreadbycompany,
        Integer       jobofferid
    ) {
        this.id = id;
        this.companyid = companyid;
        this.endtime = endtime;
        this.handleadminid = handleadminid;
        this.handletime = handletime;
        this.handleres = handleres;
        this.handleresponsecontent = handleresponsecontent;
        this.hasreadbycompany = hasreadbycompany;
        this.jobofferid = jobofferid;
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
    public String getCompanyid() {
        return this.companyid;
    }

    @Override
    public void setCompanyid(String companyid) {
        this.companyid = companyid;
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
    public String getHandleadminid() {
        return this.handleadminid;
    }

    @Override
    public void setHandleadminid(String handleadminid) {
        this.handleadminid = handleadminid;
    }

    @Override
    public LocalDateTime getHandletime() {
        return this.handletime;
    }

    @Override
    public void setHandletime(LocalDateTime handletime) {
        this.handletime = handletime;
    }

    @Override
    public Integer getHandleres() {
        return this.handleres;
    }

    @Override
    public void setHandleres(Integer handleres) {
        this.handleres = handleres;
    }

    @Override
    public String getHandleresponsecontent() {
        return this.handleresponsecontent;
    }

    @Override
    public void setHandleresponsecontent(String handleresponsecontent) {
        this.handleresponsecontent = handleresponsecontent;
    }

    @Override
    public Integer getHasreadbycompany() {
        return this.hasreadbycompany;
    }

    @Override
    public void setHasreadbycompany(Integer hasreadbycompany) {
        this.hasreadbycompany = hasreadbycompany;
    }

    @Override
    public Integer getJobofferid() {
        return this.jobofferid;
    }

    @Override
    public void setJobofferid(Integer jobofferid) {
        this.jobofferid = jobofferid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Homepushapplication (");

        sb.append(id);
        sb.append(", ").append(companyid);
        sb.append(", ").append(endtime);
        sb.append(", ").append(handleadminid);
        sb.append(", ").append(handletime);
        sb.append(", ").append(handleres);
        sb.append(", ").append(handleresponsecontent);
        sb.append(", ").append(hasreadbycompany);
        sb.append(", ").append(jobofferid);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IHomepushapplication from) {
        setId(from.getId());
        setCompanyid(from.getCompanyid());
        setEndtime(from.getEndtime());
        setHandleadminid(from.getHandleadminid());
        setHandletime(from.getHandletime());
        setHandleres(from.getHandleres());
        setHandleresponsecontent(from.getHandleresponsecontent());
        setHasreadbycompany(from.getHasreadbycompany());
        setJobofferid(from.getJobofferid());
    }

    @Override
    public <E extends IHomepushapplication> E into(E into) {
        into.from(this);
        return into;
    }
}
