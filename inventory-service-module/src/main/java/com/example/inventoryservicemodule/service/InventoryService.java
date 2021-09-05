package com.example.inventoryservicemodule.service;

import com.example.inventoryservicemodule.model.InventoryItem;

import java.util.Optional;

public interface InventoryService {
    InventoryItem findById(Long id);
    InventoryItem findByProductCode(String code);
}
