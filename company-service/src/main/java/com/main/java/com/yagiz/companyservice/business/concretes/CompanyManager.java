package com.main.java.com.yagiz.companyservice.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.java.com.yagiz.companyservice.business.abstracts.CompanyService;
import com.main.java.com.yagiz.companyservice.business.dtos.reponses.create.CreateCompanyResponse;
import com.main.java.com.yagiz.companyservice.business.dtos.reponses.get.GetCompanyListResponse;
import com.main.java.com.yagiz.companyservice.business.dtos.reponses.get.GetCompanyResponse;
import com.main.java.com.yagiz.companyservice.business.dtos.reponses.update.UpdateCompanyResponse;
import com.main.java.com.yagiz.companyservice.business.dtos.requests.CreateCompanyRequest;
import com.main.java.com.yagiz.companyservice.business.dtos.requests.UpdateCompanyRequest;
import com.main.java.com.yagiz.companyservice.business.rules.CompanyBusinessRules;
import com.main.java.com.yagiz.companyservice.entity.Company;
import com.main.java.com.yagiz.companyservice.repository.CompanyRepository;
import com.yagiz.commonservice.Mapper.ModelMapperService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CompanyManager implements CompanyService {
    private final CompanyRepository repository;
    private final ModelMapperService modelMapperService;
    private CompanyBusinessRules rules;
    
    @Override
    public GetCompanyResponse getCompanyById(int id) {
        rules.checkIfCompanyNotExists(id);
        Company company=repository.findById(id).orElseThrow();
        GetCompanyResponse response=modelMapperService.forResponse().map(company, GetCompanyResponse.class);

        return response;
    }

    @Override
    public List<GetCompanyListResponse> getAllCompanies() {
        List<Company> companies=repository.findAll();
        List<GetCompanyListResponse> response=companies.stream().map(company->modelMapperService.forResponse()
        .map(company, GetCompanyListResponse.class)).toList();
        return response;
    }

    @Override
    public CreateCompanyResponse add(CreateCompanyRequest request) {
        rules.checkIfCompanyAlreadyExists(request.getName());
        Company company=modelMapperService.forRequest().map(request,Company.class);
        company.setId(0);
        repository.save(company);
        CreateCompanyResponse response=modelMapperService.forResponse().map(company, CreateCompanyResponse.class);

        return response;
    }

    @Override
    public UpdateCompanyResponse update(int id,UpdateCompanyRequest request) {
        rules.checkIfCompanyNotExists(id);
        Company company=modelMapperService.forRequest().map(request, Company.class);
        company.setId(id);
        repository.save(company);
        UpdateCompanyResponse response=modelMapperService.forResponse().map(company, UpdateCompanyResponse.class);

        return response;
    }

    @Override
    public void deleteById(int id) {
        rules.checkIfCompanyNotExists(id);
        repository.findById(id);
    }

    @Override
    public Company getCompanyByRequestId(int id) {
        rules.checkIfCompanyNotExists(id);        
        Company company = repository.findById(id).orElseThrow();
        return company;
    }
    
}
