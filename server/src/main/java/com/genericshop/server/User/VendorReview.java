package com.genericshop.server.user;

import com.genericshop.server.model.Review;


import javax.persistence.*;

@Entity
@Table(name = "vendor_review")
public class VendorReview extends Review
{
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reviewer_id")
    private User vendorReviewer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vendor_id")
    private User vendor;

    public User getVendor()
    {
        return vendor;
    }

    public void setVendor(User vendor)
    {
        this.vendor = vendor;
    }

}
