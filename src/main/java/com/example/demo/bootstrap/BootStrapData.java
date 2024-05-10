package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner
{
    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository)
    {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        //If there are more customers in the db than the default one (John doe) Skip
        if(customerRepository.count() > 1)
        {
            return;
        }

        Customer steven = new Customer();
        steven.setFirstName("Steven");
        steven.setLastName("Johnson");
        steven.setAddress("123 Main Street");
        steven.setPostal_code("62704");
        steven.setPhone("5551234567");

        Customer emily = new Customer();
        emily.setFirstName("Emily");
        emily.setLastName("Liam");
        emily.setAddress("456 Oak Avenue,");
        emily.setPostal_code("90210");
        emily.setPhone("5559876523");

        Customer christopher = new Customer();
        christopher.setFirstName("Christopher");
        christopher.setLastName("Davis");
        christopher.setAddress("789 Pine Lane");
        christopher.setPostal_code("80123");
        christopher.setPhone("5323232399");

        Customer sophia = new Customer();
        sophia.setFirstName("Sophia");
        sophia.setLastName("Kendrick");
        sophia.setAddress("101 Elm Street,");
        sophia.setPostal_code("33602");
        sophia.setPhone("3212999911");


        Customer logan = new Customer();
        logan.setFirstName("Logan");
        logan.setLastName("Turner");
        logan.setAddress("202 Maple Road");
        logan.setPostal_code("75001");
        logan.setPhone("3999201012");

        customerRepository.save(steven);
        customerRepository.save(emily);
        customerRepository.save(christopher);
        customerRepository.save(sophia);
        customerRepository.save(logan);

        customerRepository.findAll();
    }
}
