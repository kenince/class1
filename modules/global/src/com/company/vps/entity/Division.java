package com.company.vps.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("%s|divisionName")
@Table(name = "VPS_DIVISION")
@Entity(name = "vps$Division")
public class Division extends StandardEntity {
    private static final long serialVersionUID = -2326733291048902401L;

    @Column(name = "DIVISION_NAME")
    protected String divisionName;


    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "division")
    protected List<Stations> stations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTY_ID")
    protected Counties county;

    public void setCounty(Counties county) {
        this.county = county;
    }

    public Counties getCounty() {
        return county;
    }


    public void setStations(List<Stations> stations) {
        this.stations = stations;
    }

    public List<Stations> getStations() {
        return stations;
    }



    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getDivisionName() {
        return divisionName;
    }



}