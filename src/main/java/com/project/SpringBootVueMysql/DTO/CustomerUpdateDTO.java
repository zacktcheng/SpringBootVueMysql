package com.project.SpringBootVueMysql.DTO;

public class CustomerUpdateDTO {

    private int customerId;

    private String customerName;

    private String customerAddress;

    private long mobile;

    public CustomerUpdateDTO(int customerId, String customerName, String customerAddress, long mobile) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.mobile = mobile;
    }

    public CustomerUpdateDTO() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
                "customerId=" + customerId +
                ", customername='" + customerName + '\'' +
                ", customeraddress='" + customerAddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
