package com.leto.server.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "LETO_COMPANY")
@Entity(name = "leto$Company")
public class Company extends StandardEntity {
    private static final long serialVersionUID = 6323743611817286101L;

}