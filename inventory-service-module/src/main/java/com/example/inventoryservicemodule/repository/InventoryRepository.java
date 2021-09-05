package com.example.inventoryservicemodule.repository;

import com.example.inventoryservicemodule.model.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
    Optional<InventoryItem> findById(Long id);
    Optional<InventoryItem> findByProductCode(String code);

}
