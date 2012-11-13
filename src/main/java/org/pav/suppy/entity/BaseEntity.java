/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pav.suppy.entity;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author kuntzer
 */
public abstract class BaseEntity<PK extends Serializable> implements Serializable {

    private PK id;

    public PK getId() {
        return id;
    }

    public void setId(PK id) {
        this.id = id;
    }

    @JsonIgnore
    public boolean isNew() {
        return null == getId();
    }

    @Override
    public String toString() {
        return String.format("Entity of type %s with id: %s", this.getClass().getName(), getId());
    }

    @Override
    public boolean equals(Object obj) {

        if (null == obj) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (!getClass().equals(obj.getClass())) {
            return false;
        }

        BaseEntity<?> that = (BaseEntity<?>) obj;

        return null == this.getId() ? false : this.getId().equals(that.getId());
    }

    @Override
    public int hashCode() {

        int hashCode = 17;

        hashCode += null == getId() ? 0 : getId().hashCode() * 31;

        return hashCode;
    }
}
