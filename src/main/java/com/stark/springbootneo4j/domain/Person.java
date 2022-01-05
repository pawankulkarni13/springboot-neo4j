package com.stark.springbootneo4j.domain;

import org.springframework.data.neo4j.core.schema.*;

import java.util.Collections;
import java.util.Objects;
import java.util.Optional;


@Node
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String dob;

    @Relationship(type = "couples" )
    private Person couples;

    @Relationship(type = "sonOf", direction = Relationship.Direction.OUTGOING)
    private Person sonOf;

    @Relationship(type = "daughterOf", direction = Relationship.Direction.OUTGOING)
    private Person daughterOf;

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getCouples() {
        return couples;
    }

    public void setCouples(Person couples) {
        this.couples = couples;
    }

    public Person getSonOf() {
        return sonOf;
    }

    public void setSonOf(Person sonOf) {
        this.sonOf = sonOf;
    }

    public Person getDaughterOf() {
        return daughterOf;
    }

    public void setDaughterOf(Person daughterOf) {
        this.daughterOf = daughterOf;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marriedPerson=" + couples +
                ", sonOfPerson=" + Optional.ofNullable(this.sonOf).orElse(null) +
                ", daughterOfPerson=" + daughterOf +
                '}';
    }
}
