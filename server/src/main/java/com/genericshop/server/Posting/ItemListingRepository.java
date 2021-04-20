package com.genericshop.server.posting;


import com.genericshop.server.model.VendorProfileListingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;


/**
 * JPA selecting specific columns
 * https://stackoverflow.com/questions/22007341/spring-jpa-selecting-specific-columns#
 *
 */
@Repository
public interface ItemListingRepository extends JpaRepository<ItemListing, Integer>
{
    // Unused class in current version
    Collection<VendorProfileListingData> findAllProjectedBy();
}
