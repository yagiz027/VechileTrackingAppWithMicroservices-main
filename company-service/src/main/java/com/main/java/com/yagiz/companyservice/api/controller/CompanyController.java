package com.main.java.com.yagiz.companyservice.api.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.main.java.com.yagiz.companyservice.business.abstracts.CompanyService;
import com.main.java.com.yagiz.companyservice.business.dtos.reponses.create.CreateCompanyResponse;
import com.main.java.com.yagiz.companyservice.business.dtos.reponses.get.GetCompanyListResponse;
import com.main.java.com.yagiz.companyservice.business.dtos.reponses.get.GetCompanyResponse;
import com.main.java.com.yagiz.companyservice.business.dtos.reponses.update.UpdateCompanyResponse;
import com.main.java.com.yagiz.companyservice.business.dtos.requests.CreateCompanyRequest;
import com.main.java.com.yagiz.companyservice.business.dtos.requests.UpdateCompanyRequest;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/companies")
@AllArgsConstructor
public class CompanyController {
    private CompanyService companyService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public CreateCompanyResponse add(@RequestBody CreateCompanyRequest request){
        return companyService.add(request);
    }

    @PutMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public UpdateCompanyResponse update(@PathVariable UUID id, @RequestBody UpdateCompanyRequest request){
        return companyService.update(id,request);
    }

    @GetMapping
    public List<GetCompanyListResponse> getAllCompanies(){
        return companyService.getAllCompanies();
    }

    @GetMapping("/{id}")
    public GetCompanyResponse getCompanyById(@PathVariable UUID id){
        return companyService.getCompanyById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id){
        companyService.deleteById(id);
    }
}
