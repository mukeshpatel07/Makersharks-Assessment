package com.makersharks.suppliersearchapi.dto;

import com.makersharks.suppliersearchapi.model.*;

public class SupplierQueryDTO {

    private String location;
    private NatureOfBusiness natureOfBusiness;
    private ManufacturingProcess manufacturingProcess;
    private int page;
    private int size;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public ManufacturingProcess getManufacturingProcess() {
        return manufacturingProcess;
    }

    public void setManufacturingProcess(ManufacturingProcess manufacturingProcess) {
        this.manufacturingProcess = manufacturingProcess;
    }

    public NatureOfBusiness getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(NatureOfBusiness natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }
}
