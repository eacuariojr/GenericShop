package com.genericshop.server.Posting;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemListingRepository extends JpaRepository<ItemListing, Integer>
{

}
