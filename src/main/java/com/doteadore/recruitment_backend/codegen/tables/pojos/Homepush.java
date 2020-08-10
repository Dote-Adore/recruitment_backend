/*
 * This file is generated by jOOQ.
 */
package com.doteadore.recruitment_backend.codegen.tables.pojos;


import com.doteadore.recruitment_backend.codegen.tables.interfaces.IHomepush;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Homepush implements IHomepush {

    private static final long serialVersionUID = -838269235;

    private Integer       id;
    private Integer       joboffer;
    private String        handleadminid;
    private Integer       priority;
    private LocalDateTime endtime;

    public Homepush() {}

    public Homepush(IHomepush value) {
        this.id = value.getId();
        this.joboffer = value.getJoboffer();
        this.handleadminid = value.getHandleadminid();
        this.priority = value.getPriority();
        this.endtime = value.getEndtime();
    }

    public Homepush(
        Integer       id,
        Integer       joboffer,
        String        handleadminid,
        Integer       priority,
        LocalDateTime endtime
    ) {
        this.id = id;
        this.joboffer = joboffer;
        this.handleadminid = handleadminid;
        this.priority = priority;
        this.endtime = endtime;
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
    public Integer getJoboffer() {
        return this.joboffer;
    }

    @Override
    public void setJoboffer(Integer joboffer) {
        this.joboffer = joboffer;
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
    public Integer getPriority() {
        return this.priority;
    }

    @Override
    public void setPriority(Integer priority) {
        this.priority = priority;
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
    public String toString() {
        StringBuilder sb = new StringBuilder("Homepush (");

        sb.append(id);
        sb.append(", ").append(joboffer);
        sb.append(", ").append(handleadminid);
        sb.append(", ").append(priority);
        sb.append(", ").append(endtime);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IHomepush from) {
        setId(from.getId());
        setJoboffer(from.getJoboffer());
        setHandleadminid(from.getHandleadminid());
        setPriority(from.getPriority());
        setEndtime(from.getEndtime());
    }

    @Override
    public <E extends IHomepush> E into(E into) {
        into.from(this);
        return into;
    }
}
