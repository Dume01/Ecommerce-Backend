package com.oops.project.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oops.project.model.WishList;

import java.util.List;

@Repository
public interface WishListRepository extends JpaRepository<WishList, Integer> {

    List<WishList> findAllByUserIdOrderByCreatedDateDesc(Integer userId);


}
