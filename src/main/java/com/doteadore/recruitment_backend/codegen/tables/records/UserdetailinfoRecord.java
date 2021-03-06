/*
 * This file is generated by jOOQ.
 */
package com.doteadore.recruitment_backend.codegen.tables.records;


import com.doteadore.recruitment_backend.codegen.tables.Userdetailinfo;
import com.doteadore.recruitment_backend.codegen.tables.interfaces.IUserdetailinfo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserdetailinfoRecord extends UpdatableRecordImpl<UserdetailinfoRecord> implements Record10<String, String, Integer, String, Integer, String, String, String, String, String>, IUserdetailinfo {

    private static final long serialVersionUID = 242062191;

    /**
     * Setter for <code>Recruitment.UserDetailInfo.account</code>. 用户账号
     */
    @Override
    public void setAccount(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Recruitment.UserDetailInfo.account</code>. 用户账号
     */
    @Override
    public String getAccount() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Recruitment.UserDetailInfo.name</code>. 用户姓名
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Recruitment.UserDetailInfo.name</code>. 用户姓名
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Recruitment.UserDetailInfo.sex</code>. 性别（0代表女，1代表男）
     */
    @Override
    public void setSex(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Recruitment.UserDetailInfo.sex</code>. 性别（0代表女，1代表男）
     */
    @Override
    public Integer getSex() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Recruitment.UserDetailInfo.school</code>. 所在学校
     */
    @Override
    public void setSchool(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Recruitment.UserDetailInfo.school</code>. 所在学校
     */
    @Override
    public String getSchool() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Recruitment.UserDetailInfo.graduationYear</code>. 毕业年份
     */
    @Override
    public void setGraduationyear(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Recruitment.UserDetailInfo.graduationYear</code>. 毕业年份
     */
    @Override
    public Integer getGraduationyear() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Recruitment.UserDetailInfo.education</code>. 最高学历
     */
    @Override
    public void setEducation(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Recruitment.UserDetailInfo.education</code>. 最高学历
     */
    @Override
    public String getEducation() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Recruitment.UserDetailInfo.tele</code>. 电话
     */
    @Override
    public void setTele(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Recruitment.UserDetailInfo.tele</code>. 电话
     */
    @Override
    public String getTele() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Recruitment.UserDetailInfo.email</code>. 邮箱
     */
    @Override
    public void setEmail(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Recruitment.UserDetailInfo.email</code>. 邮箱
     */
    @Override
    public String getEmail() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Recruitment.UserDetailInfo.city</code>.
     */
    @Override
    public void setCity(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Recruitment.UserDetailInfo.city</code>.
     */
    @Override
    public String getCity() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Recruitment.UserDetailInfo.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Recruitment.UserDetailInfo.description</code>.
     */
    @Override
    public String getDescription() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, Integer, String, Integer, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<String, String, Integer, String, Integer, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Userdetailinfo.USERDETAILINFO.ACCOUNT;
    }

    @Override
    public Field<String> field2() {
        return Userdetailinfo.USERDETAILINFO.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return Userdetailinfo.USERDETAILINFO.SEX;
    }

    @Override
    public Field<String> field4() {
        return Userdetailinfo.USERDETAILINFO.SCHOOL;
    }

    @Override
    public Field<Integer> field5() {
        return Userdetailinfo.USERDETAILINFO.GRADUATIONYEAR;
    }

    @Override
    public Field<String> field6() {
        return Userdetailinfo.USERDETAILINFO.EDUCATION;
    }

    @Override
    public Field<String> field7() {
        return Userdetailinfo.USERDETAILINFO.TELE;
    }

    @Override
    public Field<String> field8() {
        return Userdetailinfo.USERDETAILINFO.EMAIL;
    }

    @Override
    public Field<String> field9() {
        return Userdetailinfo.USERDETAILINFO.CITY;
    }

    @Override
    public Field<String> field10() {
        return Userdetailinfo.USERDETAILINFO.DESCRIPTION;
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
    public Integer component3() {
        return getSex();
    }

    @Override
    public String component4() {
        return getSchool();
    }

    @Override
    public Integer component5() {
        return getGraduationyear();
    }

    @Override
    public String component6() {
        return getEducation();
    }

    @Override
    public String component7() {
        return getTele();
    }

    @Override
    public String component8() {
        return getEmail();
    }

    @Override
    public String component9() {
        return getCity();
    }

    @Override
    public String component10() {
        return getDescription();
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
    public Integer value3() {
        return getSex();
    }

    @Override
    public String value4() {
        return getSchool();
    }

    @Override
    public Integer value5() {
        return getGraduationyear();
    }

    @Override
    public String value6() {
        return getEducation();
    }

    @Override
    public String value7() {
        return getTele();
    }

    @Override
    public String value8() {
        return getEmail();
    }

    @Override
    public String value9() {
        return getCity();
    }

    @Override
    public String value10() {
        return getDescription();
    }

    @Override
    public UserdetailinfoRecord value1(String value) {
        setAccount(value);
        return this;
    }

    @Override
    public UserdetailinfoRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public UserdetailinfoRecord value3(Integer value) {
        setSex(value);
        return this;
    }

    @Override
    public UserdetailinfoRecord value4(String value) {
        setSchool(value);
        return this;
    }

    @Override
    public UserdetailinfoRecord value5(Integer value) {
        setGraduationyear(value);
        return this;
    }

    @Override
    public UserdetailinfoRecord value6(String value) {
        setEducation(value);
        return this;
    }

    @Override
    public UserdetailinfoRecord value7(String value) {
        setTele(value);
        return this;
    }

    @Override
    public UserdetailinfoRecord value8(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public UserdetailinfoRecord value9(String value) {
        setCity(value);
        return this;
    }

    @Override
    public UserdetailinfoRecord value10(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public UserdetailinfoRecord values(String value1, String value2, Integer value3, String value4, Integer value5, String value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUserdetailinfo from) {
        setAccount(from.getAccount());
        setName(from.getName());
        setSex(from.getSex());
        setSchool(from.getSchool());
        setGraduationyear(from.getGraduationyear());
        setEducation(from.getEducation());
        setTele(from.getTele());
        setEmail(from.getEmail());
        setCity(from.getCity());
        setDescription(from.getDescription());
    }

    @Override
    public <E extends IUserdetailinfo> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserdetailinfoRecord
     */
    public UserdetailinfoRecord() {
        super(Userdetailinfo.USERDETAILINFO);
    }

    /**
     * Create a detached, initialised UserdetailinfoRecord
     */
    public UserdetailinfoRecord(String account, String name, Integer sex, String school, Integer graduationyear, String education, String tele, String email, String city, String description) {
        super(Userdetailinfo.USERDETAILINFO);

        set(0, account);
        set(1, name);
        set(2, sex);
        set(3, school);
        set(4, graduationyear);
        set(5, education);
        set(6, tele);
        set(7, email);
        set(8, city);
        set(9, description);
    }
}
