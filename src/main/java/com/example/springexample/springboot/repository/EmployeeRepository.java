package com.example.springexample.springboot.repository;

import com.example.springexample.springboot.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByName(String name);
    List<Employee> findByNameAndLastName(String name,String lastName);

    @Query("select e from Employee e WHERE e.name =:name")
    List<Employee> findByNameQuery(@Param("name") String name);

    @Query(value = "select * from employee e WHERE e.name =:name",nativeQuery = true)
    List<Employee> findByNameQueryNative(@Param("name") String name);


    List<Employee> findAllByNameLike(String name);

}
