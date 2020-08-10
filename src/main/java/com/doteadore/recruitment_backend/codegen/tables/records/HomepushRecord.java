/*
 * This file is generated by jOOQ.
 */
package com.doteadore.recruitment_backend.codegen.tables.records;


import com.doteadore.recruitment_backend.codegen.tables.Homepush;
import com.doteadore.recruitment_backend.codegen.tables.interfaces.IHomepush;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HomepushRecord extends UpdatableRecordImpl<HomepushRecord> implements Record5<Integer, Integer, String, Integer, LocalDateTime>, IHomepush {

    private static final long serialVersionUID = 1224553807;

    /**
     * Setter for <code>Recruitment.HomePush.id</code>.
     */
    @Override
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Recruitment.HomePush.id</code>.
     */
    @Override
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Recruitment.HomePush.jobOffer</code>. 外键对应（jobOffer:id)
     */
    @Override
    public void setJoboffer(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Recruitment.HomePush.jobOffer</code>. 外键对应（jobOffer:id)
     */
    @Override
    public Integer getJoboffer() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Recruitment.HomePush.handleAdminId</code>. 外键对应（AdminAccount:account)
     */
    @Override
    public void setHandleadminid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Recruitment.HomePush.handleAdminId</code>. 外键对应（AdminAccount:account)
     */
    @Override
    public String getHandleadminid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Recruitment.HomePush.priority</code>. 优先级 数字越大优先级越低
     */
    @Override
    public void setPriority(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Recruitment.HomePush.priority</code>. 优先级 数字越大优先级越低
     */
    @Override
    public Integer getPriority() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Recruitment.HomePush.endtime</code>. 截至推送日期
     */
    @Override
    public void setEndtime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>Recruitment.HomePush.endtime</code>. 截至推送日期
     */
    @Override
    public LocalDateTime getEndtime() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, Integer, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, String, Integer, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Homepush.HOMEPUSH.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Homepush.HOMEPUSH.JOBOFFER;
    }

    @Override
    public Field<String> field3() {
        return Homepush.HOMEPUSH.HANDLEADMINID;
    }

    @Override
    public Field<Integer> field4() {
        return Homepush.HOMEPUSH.PRIORITY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Homepush.HOMEPUSH.ENDTIME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getJoboffer();
    }

    @Override
    public String component3() {
        return getHandleadminid();
    }

    @Override
    public Integer component4() {
        return getPriority();
    }

    @Override
    public LocalDateTime component5() {
        return getEndtime();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getJoboffer();
    }

    @Override
    public String value3() {
        return getHandleadminid();
    }

    @Override
    public Integer value4() {
        return getPriority();
    }

    @Override
    public LocalDateTime value5() {
        return getEndtime();
    }

    @Override
    public HomepushRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public HomepushRecord value2(Integer value) {
        setJoboffer(value);
        return this;
    }

    @Override
    public HomepushRecord value3(String value) {
        setHandleadminid(value);
        return this;
    }

    @Override
    public HomepushRecord value4(Integer value) {
        setPriority(value);
        return this;
    }

    @Override
    public HomepushRecord value5(LocalDateTime value) {
        setEndtime(value);
        return this;
    }

    @Override
    public HomepushRecord values(Integer value1, Integer value2, String value3, Integer value4, LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
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

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HomepushRecord
     */
    public HomepushRecord() {
        super(Homepush.HOMEPUSH);
    }

    /**
     * Create a detached, initialised HomepushRecord
     */
    public HomepushRecord(Integer id, Integer joboffer, String handleadminid, Integer priority, LocalDateTime endtime) {
        super(Homepush.HOMEPUSH);

        set(0, id);
        set(1, joboffer);
        set(2, handleadminid);
        set(3, priority);
        set(4, endtime);
    }
}
