package com.caglacakir.service;

import com.caglacakir.dto.DtoEmployee;

public interface IEmployeeService {

    public DtoEmployee findEmployeeById(Long id);
}
