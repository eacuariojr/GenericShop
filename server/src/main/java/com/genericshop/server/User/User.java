package com.genericshop.server.User;

import com.genericshop.server.Posting.ItemListing;
import com.genericshop.server.Posting.ItemReview;
import com.genericshop.server.model.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends BaseEntity
{
    @Column(name = "first_name")
    @NotEmpty
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty
    private String lastName;

    @Column(name = "last_active")
    private Timestamp lastActive;

    @Column(name = "signup_date")
    private Timestamp signupDate;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "photo_path")
    @NotNull
    private String photoPath;

    //Bidirectional since there will be frequent calls from users to owned item listings
    //It shouldn't be too performance heavy since users generally won't have many listings.
    @OneToMany(mappedBy = "seller",
               fetch = FetchType.LAZY)
    private List<ItemListing> listings;

    @OneToMany(mappedBy = "vendor",
               fetch = FetchType.LAZY)
    private List<VendorReview> userReviews;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Timestamp getLastActive()
    {
        return lastActive;
    }

    public void setLastActive(Timestamp lastActive)
    {
        this.lastActive = lastActive;
    }

    public Timestamp getSignupDate()
    {
        return signupDate;
    }

    public void setSignupDate(Timestamp signupDate)
    {
        this.signupDate = signupDate;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhotoPath()
    {
        return photoPath;
    }

    public void setPhotoPath(String photoPath)
    {
        this.photoPath = photoPath;
    }
}
