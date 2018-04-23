package com.company.vps.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import java.util.Date;
import javax.persistence.Version;
import com.haulmont.cuba.core.entity.Versioned;
import com.haulmont.cuba.core.entity.SoftDelete;
import com.haulmont.cuba.core.entity.Updatable;
import com.haulmont.cuba.core.entity.Creatable;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@NamePattern("%s|occurrenceNo")
@Table(name = "VPS_OCCURRENCES")
@Entity(name = "vps$Occurrences")
public class Occurrences extends BaseIntegerIdEntity implements HasUuid, Versioned, SoftDelete, Updatable, Creatable {
    private static final long serialVersionUID = -981076817756174889L;

    @Column(name = "OCCURRENCE_NO", length = 45)
    protected String occurrenceNo;

    @Column(name = "DESCRIPTION", length = 100)
    protected String description;

    @JoinTable(name = "VPS_OCCURRENCES_OCCURRENCE_TYPES_LINK",
        joinColumns = @JoinColumn(name = "OCCURRENCES_ID"),
        inverseJoinColumns = @JoinColumn(name = "OCCURRENCE_TYPES_ID"))
    @ManyToMany
    protected List<OccurrenceTypes> typeId;

    @Column(name = "CREATED_BY", length = 50)
    protected String createdBy;

    @Column(name = "CREATE_TS")
    protected Date createTs;

    @Column(name = "UPDATE_TS")
    protected Date updateTs;

    @Column(name = "UPDATED_BY", length = 50)
    protected String updatedBy;

    @JoinTable(name = "VPS_OCCURRENCES_OCCURRENCE_STATUS_LINK",
        joinColumns = @JoinColumn(name = "OCCURRENCES_ID"),
        inverseJoinColumns = @JoinColumn(name = "OCCURRENCE_STATUS_ID"))
    @ManyToMany
    protected List<OccurrenceStatus> status;

    @Column(name = "DELETE_TS")
    protected Date deleteTs;

    @Column(name = "DELETED_BY", length = 50)
    protected String deletedBy;

    @Version
    @Column(name = "VERSION", nullable = false)
    protected Integer version;

    @Column(name = "UUID")
    protected UUID uuid;

    public List<OccurrenceTypes> getTypeId() {
        return typeId;
    }

    public void setTypeId(List<OccurrenceTypes> typeId) {
        this.typeId = typeId;
    }


    public List<OccurrenceStatus> getStatus() {
        return status;
    }

    public void setStatus(List<OccurrenceStatus> status) {
        this.status = status;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public Boolean isDeleted() {
        return deleteTs != null;
    }


    @Override
    public void setDeleteTs(Date deleteTs) {
        this.deleteTs = deleteTs;
    }

    @Override
    public Date getDeleteTs() {
        return deleteTs;
    }

    @Override
    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    @Override
    public String getDeletedBy() {
        return deletedBy;
    }

    @Override
    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    @Override
    public Date getUpdateTs() {
        return updateTs;
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    @Override
    public Date getCreateTs() {
        return createTs;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public Integer getVersion() {
        return version;
    }


    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setOccurrenceNo(String occurrenceNo) {
        this.occurrenceNo = occurrenceNo;
    }

    public String getOccurrenceNo() {
        return occurrenceNo;
    }


}