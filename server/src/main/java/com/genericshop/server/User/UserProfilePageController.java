package com.genericshop.server.user;

import com.genericshop.server.posting.ItemListing;
import com.genericshop.server.posting.ItemListingRepository;
import com.genericshop.server.posting.ItemReviewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.NoSuchElementException;

@Controller
public class UserProfilePageController
{
    private final UserRepository userRepo;
    private ItemListingRepository itemListingsRepo;
    private VendorReviewRepository vendorReviewsRepo;
    private ItemReviewRepository itemReviewRepo;

    public UserProfilePageController(UserRepository userRepo, ItemListingRepository itemListingsRepo, VendorReviewRepository vendorReviewsRepo, ItemReviewRepository itemReviewRepo)
    {
        this.userRepo = userRepo;
        this.itemListingsRepo = itemListingsRepo;
        this.vendorReviewsRepo = vendorReviewsRepo;
        this.itemReviewRepo = itemReviewRepo;
    }

    @GetMapping("/users/{userID}")
    public ModelAndView showProfile(@PathVariable("userID") int userId)
    {
        try
        {
            ModelAndView mav = new ModelAndView();
            User user = this.userRepo.findById(userId).get(); //Potentially throws NoSuchElementException

            mav.setViewName("users/users");

            if(!user.getListings().isEmpty())
            {

                for(ItemListing itemListing : user.getListings())
                {
//                    itemListing = this.itemListingsRepo.findById(itemListing.getId()).get();
                    //Implement filling required item listing data
                }

                //implement filling required review data
            }
            else if (!user.getSubmittedItemReviews().isEmpty())
            {

                //implement filling reviewing data
            }
            else
            {

            }



            //implement profile data every view will use.

            mav.addObject(user);
            return mav;
        }
        catch (NoSuchElementException exception)
        {
            throw new NoSuchElementException();
        }
    }

}
