package com.genericshop.server.model;

import com.genericshop.server.User.User;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.sql.Timestamp;

@MappedSuperclass
public class Review extends BaseEntity
{

    @Column(name = "rating")
    @NotEmpty
    private int rating;

    @Column(name = "review_body")
    private String reviewBody;

    @Column(name = "date")
    private Timestamp date;

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public String getReviewBody()
    {
        return reviewBody;
    }

    public void setReviewBody(String reviewBody)
    {
        this.reviewBody = reviewBody;
    }

    public Timestamp getDate()
    {
        return date;
    }

    public void setDate(Timestamp date)
    {
        this.date = date;
    }
}
