package org.harmonytx.mylibrary.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="checkout")
public class CheckOut {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private Date checkOutDate;

    @NotNull
    private Date expectedReturnDate;

    private Integer returned;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @JsonIgnore
    @OneToMany(mappedBy = "checkOut", cascade = CascadeType.ALL)
    private List<Borrowed> borrowed = new ArrayList<>();

    public CheckOut(){}

    public CheckOut(@NotNull Date checkOutDate, @NotNull Date expectedReturnDate, Integer returned) {
        this.checkOutDate = checkOutDate;
        this.expectedReturnDate = expectedReturnDate;
        this.returned = returned;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Date getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(Date expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

    public Integer getReturned() {
        return returned;
    }

    public void setReturned(Integer returned) {
        this.returned = returned;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Borrowed> getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(List<Borrowed> borrowed) {
        this.borrowed = borrowed;
    }
}
