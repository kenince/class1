package com.company.vps.entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.security.entity.User;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s - |login,name")
@Entity(name = "vps$Officers")
public class Officers extends User {
    private static final long serialVersionUID = 5463962136256942533L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STATION_ID")
    protected Stations station;

    public Stations getStation() {
        return station;
    }

    public void setStation(Stations station) {
        this.station = station;
    }



}