/*
 * This file is generated by jOOQ.
 */
package com.doteadore.recruitment_backend.codegen.tables.records;


import com.doteadore.recruitment_backend.codegen.tables.Companyaccount;
import com.doteadore.recruitment_backend.codegen.tables.interfaces.ICompanyaccount;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompanyaccountRecord extends UpdatableRecordImpl<CompanyaccountRecord> implements Record7<String, String, String, String, String, String, String>, ICompanyaccount {

    private static final long serialVersionUID = -1447350348;

    /**
     * Setter for <code>Recruitment.CompanyAccount.account</code>. 账号
     */
    @Override
    public void setAccount(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Recruitment.CompanyAccount.account</code>. 账号
     */
    @Override
    public String getAccount() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Recruitment.CompanyAccount.name</code>. 企业名
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Recruitment.CompanyAccount.name</code>. 企业名
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Recruitment.CompanyAccount.password</code>. 密码
     */
    @Override
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Recruitment.CompanyAccount.password</code>. 密码
     */
    @Override
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Recruitment.CompanyAccount.url</code>. 企业网址
     */
    @Override
    public void setUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Recruitment.CompanyAccount.url</code>. 企业网址
     */
    @Override
    public String getUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Recruitment.CompanyAccount.description</code>. 描述
     */
    @Override
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Recruitment.CompanyAccount.description</code>. 描述
     */
    @Override
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Recruitment.CompanyAccount.tele</code>. 电话
     */
    @Override
    public void setTele(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Recruitment.CompanyAccount.tele</code>. 电话
     */
    @Override
    public String getTele() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Recruitment.CompanyAccount.avatarUrl</code>. 头像
     */
    @Override
    public void setAvatarurl(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Recruitment.CompanyAccount.avatarUrl</code>. 头像
     */
    @Override
    public String getAvatarurl() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Companyaccount.COMPANYACCOUNT.ACCOUNT;
    }

    @Override
    public Field<String> field2() {
        return Companyaccount.COMPANYACCOUNT.NAME;
    }

    @Override
    public Field<String> field3() {
        return Companyaccount.COMPANYACCOUNT.PASSWORD;
    }

    @Override
    public Field<String> field4() {
        return Companyaccount.COMPANYACCOUNT.URL;
    }

    @Override
    public Field<String> field5() {
        return Companyaccount.COMPANYACCOUNT.DESCRIPTION;
    }

    @Override
    public Field<String> field6() {
        return Companyaccount.COMPANYACCOUNT.TELE;
    }

    @Override
    public Field<String> field7() {
        return Companyaccount.COMPANYACCOUNT.AVATARURL;
    }

    @Override
    public String component1() {
        return getAccount();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getPassword();
    }

    @Override
    public String component4() {
        return getUrl();
    }

    @Override
    public String component5() {
        return getDescription();
    }

    @Override
    public String component6() {
        return getTele();
    }

    @Override
    public String component7() {
        return getAvatarurl();
    }

    @Override
    public String value1() {
        return getAccount();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getPassword();
    }

    @Override
    public String value4() {
        return getUrl();
    }

    @Override
    public String value5() {
        return getDescription();
    }

    @Override
    public String value6() {
        return getTele();
    }

    @Override
    public String value7() {
        return getAvatarurl();
    }

    @Override
    public CompanyaccountRecord value1(String value) {
        setAccount(value);
        return this;
    }

    @Override
    public CompanyaccountRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public CompanyaccountRecord value3(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public CompanyaccountRecord value4(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public CompanyaccountRecord value5(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public CompanyaccountRecord value6(String value) {
        setTele(value);
        return this;
    }

    @Override
    public CompanyaccountRecord value7(String value) {
        setAvatarurl(value);
        return this;
    }

    @Override
    public CompanyaccountRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ICompanyaccount from) {
        setAccount(from.getAccount());
        setName(from.getName());
        setPassword(from.getPassword());
        setUrl(from.getUrl());
        setDescription(from.getDescription());
        setTele(from.getTele());
        setAvatarurl(from.getAvatarurl());
    }

    @Override
    public <E extends ICompanyaccount> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CompanyaccountRecord
     */
    public CompanyaccountRecord() {
        super(Companyaccount.COMPANYACCOUNT);
    }

    /**
     * Create a detached, initialised CompanyaccountRecord
     */
    public CompanyaccountRecord(String account, String name, String password, String url, String description, String tele, String avatarurl) {
        super(Companyaccount.COMPANYACCOUNT);

        set(0, account);
        set(1, name);
        set(2, password);
        set(3, url);
        set(4, description);
        set(5, tele);
        set(6, avatarurl);
    }
}