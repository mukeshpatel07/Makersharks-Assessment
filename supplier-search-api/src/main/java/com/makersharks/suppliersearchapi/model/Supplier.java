package com.makersharks.suppliersearchapi.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;

    private String companyName;
    private String website;
    private String location;

    @Enumerated(EnumType.STRING)
    private NatureOfBusiness natureOfBusiness;

    @ElementCollection(targetClass = ManufacturingProcess.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "supplier_manufacturing_process", joinColumns = @JoinColumn(name = "supplier_id"))
    @Column(name = "manufacturing_process")
    private Set<ManufacturingProcess> manufacturingProcesses;

    // Getters and Setters (or use Lombok @Data)

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public NatureOfBusiness getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(NatureOfBusiness natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public Set<ManufacturingProcess> getManufacturingProcesses() {
        return manufacturingProcesses;
    }

    public void setManufacturingProcesses(Set<ManufacturingProcess> manufacturingProcesses) {
        this.manufacturingProcesses = manufacturingProcesses;
    }
}
