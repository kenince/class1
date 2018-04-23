package com.company.vps.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|subCounty")
@Table(name = "VPS_SUB_COUNTIES")
@Entity(name = "vps$SubCounties")
public class SubCounties extends StandardEntity {
    private static final long serialVersionUID = -7985786757854367108L;

    @Column(name = "SUB_COUNTY")
    protected String subCounty;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTY_ID")
    protected Counties county;

    public void setSubCounty(String subCounty) {
        this.subCounty = subCounty;
    }

    public String getSubCounty() {
        return subCounty;
    }

    public void setCounty(Counties county) {
        this.county = county;
    }

    public Counties getCounty() {
        return county;
    }


}