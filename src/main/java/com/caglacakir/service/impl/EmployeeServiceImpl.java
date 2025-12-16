package com.caglacakir.service.impl;

import com.caglacakir.dto.DtoDepartment;
import com.caglacakir.dto.DtoEmployee;
import com.caglacakir.exception.BaseException;
import com.caglacakir.exception.ErrorMessage;
import com.caglacakir.exception.MessageType;
import com.caglacakir.model.Department;
import com.caglacakir.model.Employee;
import com.caglacakir.repository.EmployeeRepository;
import com.caglacakir.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public DtoEmployee findEmployeeById(Long id) {
        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();

        Optional<Employee> optional = employeeRepository.findById(id);
        if(optional.isEmpty()) {
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, id.toString()));
            //BaseException bizim olusturdugumuz bir sınıf. Ness olusturduk. Parametreli ctor'u sectik, mesaj tipini verdik
            // ikinci parametre manuel gireceğimiz ofStatic. id yi verdik. String olacsgı için toString ile String e cevirdik.
        }
        Employee employee = optional.get();
        Department department = employee.getDepartment();

        BeanUtils.copyProperties(employee, dtoEmployee);
        BeanUtils.copyProperties(department, dtoDepartment);

        dtoEmployee.setDepartment(dtoDepartment);

        return dtoEmployee;
    }
}

