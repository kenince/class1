package com.company.vps.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|statusDesc")
@Table(name = "VPS_OCCURRENCE_STATUS")
@Entity(name = "vps$OccurrenceStatus")
public class OccurrenceStatus extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 8929207496074474986L;

    @Column(name = "STATUS_DESC")
    protected String statusDesc;

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public String getStatusDesc() {
        return statusDesc;
    }


}