package com.GoShop.inventoryservice.repository;

import com.GoShop.inventoryservice.module.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findbySkuCode();
}
