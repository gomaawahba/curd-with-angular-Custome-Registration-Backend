package com.ahmed.Service;

import com.ahmed.DTO.CustomerDTO;
import com.ahmed.DTO.CustomerSaveDTO;
import com.ahmed.DTO.CustomerUpdateDTO;
import com.ahmed.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getAllCustomer();

    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

    boolean deleteCustomer(int id);


}
