package com.makersharks.suppliersearchapi.controller;

import com.makersharks.suppliersearchapi.dto.SupplierQueryDTO;
import com.makersharks.suppliersearchapi.model.Supplier;
import com.makersharks.suppliersearchapi.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public ResponseEntity<Page<Supplier>> querySuppliers(@RequestBody SupplierQueryDTO queryDTO) {
        Page<Supplier> suppliers = supplierService.findSuppliers(
                queryDTO.getLocation(),
                queryDTO.getNatureOfBusiness(),
                queryDTO.getManufacturingProcess(),
                queryDTO.getPage(),
                queryDTO.getSize()
        );
        return ResponseEntity.ok(suppliers);
    }
}