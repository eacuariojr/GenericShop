package com.genericshop.server.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.sql.Timestamp;

    /**
     * JavaBean domain object representing a listing for an item
     *
     * Refer to Google documentation for the entire schema diagram:
     * https://docs.google.com/document/d/1a33PpVdREhIlmZ4vDFSJXvBfSOwcdjnNo_MDfkTMFoE/edit?usp=sharing
     */

@Entity
@Table(name = "item_listing")
public class ItemListing extends BaseEntity
{

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User user;

    @Column(name = "price")
    @NotEmpty
    private double price;

    @Column(name = "name")
    @NotEmpty
    private String name;

    @Column(name = "description")
    @NotEmpty
    private String description;

    @Column(name = "image_path")
    @NotEmpty
    private String imagePath;

    @Column(name = "quantity")
    @NotEmpty
    private int quantity;

    @Column(name = "posting_date")
    @NotEmpty
    private Timestamp postingDate;

    @Column(name = "last_active")
    @NotEmpty
    private Timestamp lastActive;


    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getImagePath()
    {
        return imagePath;
    }

    public void setImagePath(String imagePath)
    {
        this.imagePath = imagePath;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public Timestamp getPostingDate()
    {
        return postingDate;
    }

    public void setPostingDate(Timestamp postingDate)
    {
        this.postingDate = postingDate;
    }

    public Timestamp getLastActive()
    {
        return lastActive;
    }

    public void setLastActive(Timestamp lastActive)
    {
        this.lastActive = lastActive;
    }
}
