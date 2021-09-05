package com.example.inventoryservicemodule.service.impl;

import com.example.inventoryservicemodule.model.InventoryItem;
import com.example.inventoryservicemodule.repository.InventoryRepository;
import com.example.inventoryservicemodule.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class InventoryServiceImpl implements InventoryService {

    InventoryRepository inventoryRepository;

    @Override
    public InventoryItem findByProductCode(String code) {
        return inventoryRepository.findByProductCode(code).get();
    }

    @Autowired
    public InventoryServiceImpl(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public InventoryItem findById(Long id) {
        return inventoryRepository.findById(id).get();
    }
}
