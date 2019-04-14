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

    @Column(name = "CODE", nullable = false, unique = true)
    protected String code;

    @Column(name = "CODE_ISO")
    protected String codeIso;

    @Column(name = "DOMAIN")
    protected String domain;

    @Column(name = "NAME", nullable = false, unique = true)
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

    public String getCodeIso() {
        return codeIso;
    }

    public void setCodeIso(String codeIso) {
        this.codeIso = codeIso;
    }
}