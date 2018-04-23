package com.company.vps.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.validation.constraints.NotNull;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("%s|countyName")
@Table(name = "VPS_COUNTIES")
@Entity(name = "vps$Counties")
public class Counties extends StandardEntity {
    private static final long serialVersionUID = -6364329118359162190L;

    @NotNull
    @Column(name = "COUNTY_CODE", nullable = false)
    protected Integer countyCode;

    @NotNull
    @Column(name = "COUNTY_NAME", nullable = false)
    protected String countyName;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "county")
    protected List<SubCounties> subCounties;


    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "county")
    protected List<Division> divisions;

    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }

    public List<Division> getDivisions() {
        return divisions;
    }


    public void setSubCounties(List<SubCounties> subCounties) {
        this.subCounties = subCounties;
    }

    public List<SubCounties> getSubCounties() {
        return subCounties;
    }


    public void setCountyCode(Integer countyCode) {
        this.countyCode = countyCode;
    }

    public Integer getCountyCode() {
        return countyCode;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyName() {
        return countyName;
    }


}