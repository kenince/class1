package com.company.vps.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|typeName")
@Table(name = "VPS_OCCURRENCE_TYPES")
@Entity(name = "vps$OccurrenceTypes")
public class OccurrenceTypes extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 7512172344339503581L;

    @Column(name = "TYPE_NAME")
    protected String typeName;

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }


}