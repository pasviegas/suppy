/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pav.suppy.entity.basic;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.google.common.base.Objects;

@SuppressWarnings("serial")
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
        return Objects.toStringHelper(this.getClass()).add("id", getId()).toString();
    }

    @Override
    @SuppressWarnings("rawtypes")
    public boolean equals(Object obj) {
		BaseEntity that = (BaseEntity)obj;
        return Objects.equal(this, that) 
        	&& Objects.equal(this.getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this);
    }
}
