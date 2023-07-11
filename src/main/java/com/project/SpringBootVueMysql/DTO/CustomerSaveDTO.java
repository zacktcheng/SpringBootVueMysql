package com.project.SpringBootVueMysql.DTO;

public class CustomerSaveDTO {

    private String customerName;

    private String customerAddress;

    private long mobile;

    public CustomerSaveDTO(String customerName, String customerAddress, long mobile) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.mobile = mobile;
    }

    public CustomerSaveDTO() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                ", customername='" + customerName + '\'' +
                ", customeraddress='" + customerAddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
