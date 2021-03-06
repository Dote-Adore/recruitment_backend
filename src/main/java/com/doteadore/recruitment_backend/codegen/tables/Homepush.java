/*
 * This file is generated by jOOQ.
 */
package com.doteadore.recruitment_backend.codegen.tables;


import com.doteadore.recruitment_backend.codegen.Indexes;
import com.doteadore.recruitment_backend.codegen.Keys;
import com.doteadore.recruitment_backend.codegen.Recruitment;
import com.doteadore.recruitment_backend.codegen.tables.records.HomepushRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class Homepush extends TableImpl<HomepushRecord> {

    private static final long serialVersionUID = -380728775;

    /**
     * The reference instance of <code>Recruitment.HomePush</code>
     */
    public static final Homepush HOMEPUSH = new Homepush();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HomepushRecord> getRecordType() {
        return HomepushRecord.class;
    }

    /**
     * The column <code>Recruitment.HomePush.id</code>.
     */
    public final TableField<HomepushRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Recruitment.HomePush.jobOffer</code>. 外键对应（jobOffer:id)
     */
    public final TableField<HomepushRecord, Integer> JOBOFFER = createField(DSL.name("jobOffer"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "外键对应（jobOffer:id)");

    /**
     * The column <code>Recruitment.HomePush.handleAdminId</code>. 外键对应（AdminAccount:account)
     */
    public final TableField<HomepushRecord, String> HANDLEADMINID = createField(DSL.name("handleAdminId"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "外键对应（AdminAccount:account)");

    /**
     * The column <code>Recruitment.HomePush.priority</code>. 优先级 数字越大优先级越低
     */
    public final TableField<HomepushRecord, Integer> PRIORITY = createField(DSL.name("priority"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "优先级 数字越大优先级越低");

    /**
     * The column <code>Recruitment.HomePush.endtime</code>. 截至推送日期
     */
    public final TableField<HomepushRecord, LocalDateTime> ENDTIME = createField(DSL.name("endtime"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "截至推送日期");

    /**
     * Create a <code>Recruitment.HomePush</code> table reference
     */
    public Homepush() {
        this(DSL.name("HomePush"), null);
    }

    /**
     * Create an aliased <code>Recruitment.HomePush</code> table reference
     */
    public Homepush(String alias) {
        this(DSL.name(alias), HOMEPUSH);
    }

    /**
     * Create an aliased <code>Recruitment.HomePush</code> table reference
     */
    public Homepush(Name alias) {
        this(alias, HOMEPUSH);
    }

    private Homepush(Name alias, Table<HomepushRecord> aliased) {
        this(alias, aliased, null);
    }

    private Homepush(Name alias, Table<HomepushRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Homepush(Table<O> child, ForeignKey<O, HomepushRecord> key) {
        super(child, key, HOMEPUSH);
    }

    @Override
    public Schema getSchema() {
        return Recruitment.RECRUITMENT;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.HOMEPUSH_HOMEPUSH_FK1, Indexes.HOMEPUSH_HOMEPUSH_FK2);
    }

    @Override
    public Identity<HomepushRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HOMEPUSH;
    }

    @Override
    public UniqueKey<HomepushRecord> getPrimaryKey() {
        return Keys.KEY_HOMEPUSH_PRIMARY;
    }

    @Override
    public List<UniqueKey<HomepushRecord>> getKeys() {
        return Arrays.<UniqueKey<HomepushRecord>>asList(Keys.KEY_HOMEPUSH_PRIMARY);
    }

    @Override
    public List<ForeignKey<HomepushRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<HomepushRecord, ?>>asList(Keys.HOMEPUSH_FK1, Keys.HOMEPUSH_FK2);
    }

    public Joboffer joboffer() {
        return new Joboffer(this, Keys.HOMEPUSH_FK1);
    }

    public Adminaccount adminaccount() {
        return new Adminaccount(this, Keys.HOMEPUSH_FK2);
    }

    @Override
    public Homepush as(String alias) {
        return new Homepush(DSL.name(alias), this);
    }

    @Override
    public Homepush as(Name alias) {
        return new Homepush(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Homepush rename(String name) {
        return new Homepush(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Homepush rename(Name name) {
        return new Homepush(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, Integer, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
