package com.genericshop.server.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorReviewRepository extends JpaRepository<VendorReview, Integer>
{
}
