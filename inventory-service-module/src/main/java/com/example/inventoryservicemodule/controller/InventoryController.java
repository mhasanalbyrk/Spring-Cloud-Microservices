package com.example.inventoryservicemodule.controller;

import com.example.inventoryservicemodule.model.InventoryItem;
import com.example.inventoryservicemodule.service.InventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/inventory")
public class InventoryController {
    InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("{code}")
    ResponseEntity<?> getProductByCode(@PathVariable String code){

        log.info("Finding inventory for product code :"+code);
        InventoryItem inventoryItem = inventoryService.findByProductCode(code);

        return ResponseEntity.ok(inventoryItem);
    }
}
