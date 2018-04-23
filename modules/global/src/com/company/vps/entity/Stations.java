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
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("%s|stationName")
@Table(name = "VPS_STATIONS")
@Entity(name = "vps$Stations")
public class Stations extends StandardEntity {
    private static final long serialVersionUID = -2396844722300702669L;

    @Column(name = "STATION_NAME")
    protected String stationName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DIVISION_ID")
    protected Division division;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "station")
    protected List<Officers> officers;

    public void setOfficers(List<Officers> officers) {
        this.officers = officers;
    }

    public List<Officers> getOfficers() {
        return officers;
    }


    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Division getDivision() {
        return division;
    }


}