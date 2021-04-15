package com.genericshop.server.model;

import com.genericshop.server.User.User;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.sql.Timestamp;

@MappedSuperclass
public class Review extends BaseEntity
{
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reviewer_id")
    private User reviewer;

    @Column(name = "rating")
    @NotEmpty
    private int rating;

    @Column(name = "review_body")
    private String reviewBody;

    @Column(name = "date")
    private Timestamp date;

    public User getReviewer()
    {
        return reviewer;
    }

    public void setReviewer(User reviewer)
    {
        this.reviewer = reviewer;
    }

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
