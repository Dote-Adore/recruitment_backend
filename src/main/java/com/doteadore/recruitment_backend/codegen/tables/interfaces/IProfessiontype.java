/*
 * This file is generated by jOOQ.
 */
package com.doteadore.recruitment_backend.codegen.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IProfessiontype extends Serializable {

    /**
     * Setter for <code>Recruitment.ProfessionType.key</code>.
     */
    public void setKey(Integer value);

    /**
     * Getter for <code>Recruitment.ProfessionType.key</code>.
     */
    public Integer getKey();

    /**
     * Setter for <code>Recruitment.ProfessionType.value</code>.
     */
    public void setValue(String value);

    /**
     * Getter for <code>Recruitment.ProfessionType.value</code>.
     */
    public String getValue();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IProfessiontype
     */
    public void from(IProfessiontype from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IProfessiontype
     */
    public <E extends IProfessiontype> E into(E into);
}
