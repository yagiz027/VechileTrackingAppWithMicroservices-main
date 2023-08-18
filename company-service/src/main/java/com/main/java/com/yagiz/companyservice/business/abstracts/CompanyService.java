package com.main.java.com.yagiz.companyservice.business.abstracts;

import java.util.List;

import com.main.java.com.yagiz.companyservice.business.dtos.reponses.create.CreateCompanyResponse;
import com.main.java.com.yagiz.companyservice.business.dtos.reponses.get.GetCompanyListResponse;
import com.main.java.com.yagiz.companyservice.business.dtos.reponses.get.GetCompanyResponse;
import com.main.java.com.yagiz.companyservice.business.dtos.reponses.update.UpdateCompanyResponse;
import com.main.java.com.yagiz.companyservice.business.dtos.requests.CreateCompanyRequest;
import com.main.java.com.yagiz.companyservice.business.dtos.requests.UpdateCompanyRequest;

public interface CompanyService {
    GetCompanyResponse getCompanyById(int id);
    List<GetCompanyListResponse> getAllCompanies();
    CreateCompanyResponse add(CreateCompanyRequest request);
    UpdateCompanyResponse update(int id,UpdateCompanyRequest request);
    void deleteById(int id);
}
