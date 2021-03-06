/*
 * This file is generated by jOOQ.
 */
package com.doteadore.recruitment_backend.codegen.tables;


import com.doteadore.recruitment_backend.codegen.Keys;
import com.doteadore.recruitment_backend.codegen.Recruitment;
import com.doteadore.recruitment_backend.codegen.tables.records.UseraccontRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Useraccont extends TableImpl<UseraccontRecord> {

    private static final long serialVersionUID = -745855501;

    /**
     * The reference instance of <code>Recruitment.UserAccont</code>
     */
    public static final Useraccont USERACCONT = new Useraccont();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UseraccontRecord> getRecordType() {
        return UseraccontRecord.class;
    }

    /**
     * The column <code>Recruitment.UserAccont.account</code>. 账号
     */
    public final TableField<UseraccontRecord, String> ACCOUNT = createField(DSL.name("account"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "账号");

    /**
     * The column <code>Recruitment.UserAccont.nickName</code>. 昵称（非真实姓名）
     */
    public final TableField<UseraccontRecord, String> NICKNAME = createField(DSL.name("nickName"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "昵称（非真实姓名）");

    /**
     * The column <code>Recruitment.UserAccont.password</code>. 密码
     */
    public final TableField<UseraccontRecord, String> PASSWORD = createField(DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "密码");

    /**
     * The column <code>Recruitment.UserAccont.avatarUrl</code>. 头像
     */
    public final TableField<UseraccontRecord, String> AVATARURL = createField(DSL.name("avatarUrl"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "头像");

    /**
     * Create a <code>Recruitment.UserAccont</code> table reference
     */
    public Useraccont() {
        this(DSL.name("UserAccont"), null);
    }

    /**
     * Create an aliased <code>Recruitment.UserAccont</code> table reference
     */
    public Useraccont(String alias) {
        this(DSL.name(alias), USERACCONT);
    }

    /**
     * Create an aliased <code>Recruitment.UserAccont</code> table reference
     */
    public Useraccont(Name alias) {
        this(alias, USERACCONT);
    }

    private Useraccont(Name alias, Table<UseraccontRecord> aliased) {
        this(alias, aliased, null);
    }

    private Useraccont(Name alias, Table<UseraccontRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Useraccont(Table<O> child, ForeignKey<O, UseraccontRecord> key) {
        super(child, key, USERACCONT);
    }

    @Override
    public Schema getSchema() {
        return Recruitment.RECRUITMENT;
    }

    @Override
    public UniqueKey<UseraccontRecord> getPrimaryKey() {
        return Keys.KEY_USERACCONT_PRIMARY;
    }

    @Override
    public List<UniqueKey<UseraccontRecord>> getKeys() {
        return Arrays.<UniqueKey<UseraccontRecord>>asList(Keys.KEY_USERACCONT_PRIMARY);
    }

    @Override
    public Useraccont as(String alias) {
        return new Useraccont(DSL.name(alias), this);
    }

    @Override
    public Useraccont as(Name alias) {
        return new Useraccont(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Useraccont rename(String name) {
        return new Useraccont(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Useraccont rename(Name name) {
        return new Useraccont(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
