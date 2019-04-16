package com.leto.server.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.EmbeddedParameters;
import com.leto.server.validation.Email;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "LETO_CUSTOMER")
@Entity(name = "leto$Customer")
@NamePattern(value = "%s|name")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 6323743611817286101L;

    @Column(name="NAME", nullable = false)
    protected String name;

    @Column(name = "EMAIL")
    @Email
    protected String email;

    @Embedded
    @EmbeddedParameters(nullAllowed = false)
    protected Address address;

    @Column(name = "PHONE")
    protected String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}