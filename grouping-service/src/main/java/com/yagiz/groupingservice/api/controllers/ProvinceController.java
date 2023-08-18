package com.yagiz.groupingservice.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yagiz.groupingservice.business.abstracts.ProvinceService;
import com.yagiz.groupingservice.business.dto.responses.get.GetProvinceById;
import com.yagiz.groupingservice.business.dto.responses.get.GetProvinceList;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping(value = "api/provinces")
@AllArgsConstructor
public class ProvinceController {
    private ProvinceService service;

    @GetMapping("/{id}")
    public GetProvinceById getProvinceById(@PathVariable int id) {
        return service.getById(id);
    }

    @GetMapping()
    public List<GetProvinceList> getProvinceList(){
        return service.getProvinceList();
    }
    
}