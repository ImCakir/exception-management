package com.caglacakir.controller;

import com.caglacakir.dto.DtoEmployee;
import com.caglacakir.model.RootEntity;

public interface RestEmployeeController {

    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
