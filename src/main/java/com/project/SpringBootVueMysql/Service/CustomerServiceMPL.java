package com.project.SpringBootVueMysql.Service;

import com.project.SpringBootVueMysql.CustomerRepository.CustomerRepository;
import com.project.SpringBootVueMysql.DTO.*;
import com.project.SpringBootVueMysql.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceMPL implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {

        Customer customer = new Customer(
                customerSaveDTO.getCustomerName(),
                customerSaveDTO.getCustomerAddress(),
                customerSaveDTO.getMobile()
        );
        customerRepository.save(customer);
        return customer.getCustomername();
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        List<Customer> cutomers = customerRepository.findAll();
        List<CustomerDTO> customerDTOS = new ArrayList<>();
        for (Customer customer: cutomers) {
            CustomerDTO customerDTO = new CustomerDTO(
                    customer.getCustomerId(),
                    customer.getCustomername(),
                    customer.getCustomeraddress(),
                    customer.getMobile()
            );
            customerDTOS.add(customerDTO);
        }
        return  customerDTOS;
    }

    @Override
    public String updateCustomers(CustomerUpdateDTO customerUpdateDTO) {
        if (customerRepository.existsById(customerUpdateDTO.getCustomerId())) {
            Customer customer = customerRepository.getById(customerUpdateDTO.getCustomerId());
            customer.setCustomername(customerUpdateDTO.getCustomerName());
            customer.setCustomeraddress(customerUpdateDTO.getCustomerAddress());
            customer.setMobile(customerUpdateDTO.getMobile());
            customerRepository.save(customer);
            return customer.getCustomername();
        }
        return "Customer ID does not exist";
    }

    @Override
    public boolean deleteCustomer(int id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
