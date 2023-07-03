package com.ahmed.Service;

import com.ahmed.CustomerRepo.CustomerRepo;
import com.ahmed.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceTwo {
    private CustomerRepo customerRepo;
    @Autowired
    public CustomerServiceTwo(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }
    /*
    *  public List<Customer>getcustomerbykey(String key,int page,int size){
        Pageable pageable= PageRequest.of(page, size);
        return this.customerRepo.findByNameContaining(key,pageable).getContent();
    }
    *
    * */

}
