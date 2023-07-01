package com.oops.project.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.oops.project.model.WishList;
import com.oops.project.repository.WishListRepository;


@Service
@Transactional
public class WishListService {

    private final WishListRepository wishListRepository;

    public WishListService(WishListRepository wishListRepository) {
        this.wishListRepository = wishListRepository;
    }

    public void createWishlist(WishList wishList) {
        wishListRepository.save(wishList);
    }

    public List<WishList> readWishList(Integer userId) {
        return wishListRepository.findAllByUserIdOrderByCreatedDateDesc(userId);
    }
}
