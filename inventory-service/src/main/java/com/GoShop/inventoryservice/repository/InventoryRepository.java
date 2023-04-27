package com.GoShop.inventoryservice.repository;

import com.GoShop.inventoryservice.module.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findbySkuCode(List<String> skuCode);
}
