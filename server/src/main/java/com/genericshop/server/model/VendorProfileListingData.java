package com.genericshop.server.model;

/**
 * Collection interface using JPA Projections:
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#projections
 *
 * Contains only the relevant item_listing data when used to display on a vendor's profile
 */

// Unused class in current version
public interface VendorProfileListingData
{
    String imagePath();
    String itemName();
    String itemPrice();
}
