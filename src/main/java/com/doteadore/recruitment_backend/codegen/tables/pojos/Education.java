/*
 * This file is generated by jOOQ.
 */
package com.doteadore.recruitment_backend.codegen.tables.pojos;


import com.doteadore.recruitment_backend.codegen.tables.interfaces.IEducation;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Education implements IEducation {

    private static final long serialVersionUID = 1406992064;

    private Integer key;
    private String  value;

    public Education() {}

    public Education(IEducation value) {
        this.key = value.getKey();
        this.value = value.getValue();
    }

    public Education(
        Integer key,
        String  value
    ) {
        this.key = key;
        this.value = value;
    }

    @Override
    public Integer getKey() {
        return this.key;
    }

    @Override
    public void setKey(Integer key) {
        this.key = key;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Education (");

        sb.append(key);
        sb.append(", ").append(value);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IEducation from) {
        setKey(from.getKey());
        setValue(from.getValue());
    }

    @Override
    public <E extends IEducation> E into(E into) {
        into.from(this);
        return into;
    }
}
