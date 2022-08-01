package com.example.casestudy.repository;

import com.example.casestudy.model.employee.Division;
import com.example.casestudy.model.employee.EducationDegree;
import com.example.casestudy.model.employee.Employee;
import com.example.casestudy.model.employee.Position;
import com.example.casestudy.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    @Modifying
    @Query(value = "update Employee set employee_name=:employeeName, employee_day_of_birth=:employeeDayOfBirth, " +
            " employee_id_card=:employeeIdCard,employee_salary=:employeeSalary, " +
            " employee_phone_number=:employeePhoneNumber,employee_email=:employeeEmail, " +
            " employee_address=:employeeAddress,position_id=:position,education_degree_id=:educationDegree, " +
            " division_id=:division,user_name=:userName where employee_id=:employeeId ",nativeQuery = true)
void updateEmployee(@Param("employeeName")String employeeName, @Param("employeeDayOfBirth")String employeeDayOfBirth, @Param("employeeIdCard")String employeeIdCard,
                    @Param("employeeSalary") double employeeSalary, @Param("employeePhoneNumber")String employeePhoneNumber,
                    @Param("employeeEmail") String employeeEmail, @Param("employeeAddress") String employeeAddress,
                    @Param("position") Position position, @Param("educationDegree") EducationDegree educationDegree,
                    @Param("division") Division division, @Param("userName") User userName, @Param("employeeId")int employeeId);
}
