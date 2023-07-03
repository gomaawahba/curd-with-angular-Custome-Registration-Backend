package com.ahmed.CustomerController;
import com.ahmed.DTO.CustomerDTO;
import com.ahmed.DTO.CustomerSaveDTO;
import com.ahmed.DTO.CustomerUpdateDTO;
import com.ahmed.Service.CustomerService;
import com.ahmed.Service.CustomerServiceIMPL;
import com.ahmed.Service.CustomerServiceTwo;
import com.ahmed.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController
{

    private CustomerService customerService;
    private CustomerServiceTwo customerServiceTwo;

    @Autowired
    public CustomerController(CustomerService customerService, CustomerServiceTwo customerServiceTwo) {
        this.customerService = customerService;
        this.customerServiceTwo = customerServiceTwo;
    }





    @PostMapping(path = "/save")

    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO)
    {
        String id = customerService.addCustomer(customerSaveDTO);
        return id;
    }

    @GetMapping(path = "/getAllCustomer")
    public List<CustomerDTO> getAllCustomer()
    {
        List<CustomerDTO>allCustomers = customerService.getAllCustomer();
        return allCustomers;
    }

    @PutMapping(path = "/update")

    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO)
    {
        String id = customerService.updateCustomers(customerUpdateDTO);
        return id;
    }

    @DeleteMapping(path = "/deletecustomer/{id}")
    public String deleteCustomer(@PathVariable(value = "id") int id)
    {
        boolean deletecustomer = customerService.deleteCustomer(id);
        return "deleted";
    }
    //// http://localhost:8080/api/customerkey?word={key}&page={value}&size={value}
 //   @GetMapping("/customerkey")
  //  public List<Customer> getOrdersBykey(@RequestParam String word, @RequestParam int page, @RequestParam int size){
       // return this.customerServiceIMPL.getallordersbykey(word,page,size);
 //   }
    //// http://localhost:8080/api/orderkey?word={key}&page={value}&size={value}

    /*
    *
    *    @GetMapping("/orderkey")
    public List<Customer> getOrdersBykey(@RequestParam String word,@RequestParam int page,@RequestParam int size){
        return this.customerServiceTwo.getcustomerbykey(word,page,size);
    }
    *
    * */


}
