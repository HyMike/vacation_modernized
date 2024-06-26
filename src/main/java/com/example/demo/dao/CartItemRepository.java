package com.example.demo.dao;

import com.example.demo.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Repository
//@RepositoryRestResource(collectionResourceRel = "cart_items", path = "cartItems")
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
