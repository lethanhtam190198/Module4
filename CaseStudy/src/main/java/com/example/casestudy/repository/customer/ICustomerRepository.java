package com.example.casestudy.repository.customer;

import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.model.customer.CustomerType;
import com.example.casestudy.model.employee.Division;
import com.example.casestudy.model.employee.EducationDegree;
import com.example.casestudy.model.employee.Position;
import com.example.casestudy.model.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

    @Modifying
    @Query(value = "update Customer set customer_type_id=:customerTypeId , " +
            " customer_name=:customerName, " +
            " day_of_birth=:dayOfBirth , " +
            " gender=:gender, " +
            " customer_id_card=:customerIdCard, " +
            " phone_number=:phoneNumber , " +
            " customer_email=:customerEmail ," +
            " address=:address where customer_id=:customerId " ,nativeQuery = true)
    void updateCustomer(@Param("customerTypeId") CustomerType customerTypeId,
                        @Param("customerName")String customerName,
                        @Param("dayOfBirth") String dayOfBirth,
                        @Param("gender") int gender,
                        @Param("customerIdCard")String customerIdCard,
                        @Param("phoneNumber")String phoneNumber,
                        @Param("customerEmail")String customerEmail,
                        @Param("address")String address,
                        @Param("customerId")int customerId);

    @Query(value = "select * from customer where  customer_name like :name ",nativeQuery = true)
    Page<Customer> searchByName(@Param("name")String name, Pageable pageable);
}
