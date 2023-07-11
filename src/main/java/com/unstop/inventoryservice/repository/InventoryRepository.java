package com.unstop.inventoryservice.repository;

import com.unstop.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    @Query("SELECT inventory FROM Inventory inventory WHERE inventory.skuCode = :skuCode")
    Optional<Inventory> findBySkuCode();
}
