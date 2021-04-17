package com.genericshop.server.posting;


import com.genericshop.server.user.User;
import com.genericshop.server.model.Review;

import javax.persistence.*;

@Entity
@Table(name = "item_review")
public class ItemReview extends Review
{
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reviewer_id")
    private User itemReviewer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private ItemListing item;

    public ItemListing getItem()
    {
        return item;
    }

    public void setItem(ItemListing item)
    {
        this.item = item;
    }
}
