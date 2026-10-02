package com.complainApp.proto.repository;

import com.complainApp.proto.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}