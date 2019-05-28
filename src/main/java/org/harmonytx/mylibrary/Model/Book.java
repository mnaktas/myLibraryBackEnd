package org.harmonytx.mylibrary.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String ISBN;

    @NotEmpty
    private String title;

    @NotEmpty
    private String year;

    @NotBlank
    private String tag;

    @NotEmpty
    private String author;

    @NotEmpty
    private String publisher;

    private Integer status;

    private Date createDate;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;


    public Book() {
    }

    public Book(@NotEmpty String ISBN, @NotEmpty String title, @NotEmpty String year, @NotBlank String tag, @NotEmpty String author, @NotEmpty String publisher, Integer status, Date createDate) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.tag = tag;
        this.author = author;
        this.publisher = publisher;
        this.status = status;
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}