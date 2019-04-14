package com.leto.server.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern(value = "%s|name")
@Table(name = "LETO_COUNTRY")
@Entity(name = "leto$Country")
public class Country extends StandardEntity {
    private static final long serialVersionUID = 6323743611817286101L;

    @Column(name = "CODE")
    protected String code;

    @Column(name = "DOMAIN")
    protected String domain;

    @Column(name = "name", nullable = false, unique = true)
    protected String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}