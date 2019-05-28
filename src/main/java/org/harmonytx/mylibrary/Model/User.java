package org.harmonytx.mylibrary.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private int idnumber;
    @NotNull

    @NotNull
    private String type;
    @NotNull
    private String firstname;
    @NotNull
    private String lastname;
    @NotNull
    @NotNull
    private String gender;

    @NotNull
    private String grade;

    @NotNull
    private Date joinedDate;

    @Email
    @NotNull
    private String email;


    public User() {
        super();
    }

    public User(@NotNull int idnumber, @NotNull @NotNull String type, @NotNull String firstname, @NotNull String lastname, @NotNull @NotNull String gender, @NotNull String grade, @NotNull Date joinedDate, @Email @NotNull String email) {
        this.idnumber = idnumber;
        this.type = type;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.grade = grade;
        this.joinedDate = joinedDate;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
