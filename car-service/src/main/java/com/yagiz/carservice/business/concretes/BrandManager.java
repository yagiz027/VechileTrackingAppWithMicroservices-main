package com.yagiz.carservice.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yagiz.carservice.business.abstracts.BrandService;
import com.yagiz.carservice.business.dto.reponses.create.CreateBrandResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetBrandListResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetBrandResponse;
import com.yagiz.carservice.business.dto.reponses.update.UpdateBrandResponse;
import com.yagiz.carservice.business.dto.requests.create.CreateBrandRequest;
import com.yagiz.carservice.business.dto.requests.update.UpdateBrandRequest;
import com.yagiz.carservice.business.rules.BrandBusinessRules;
import com.yagiz.carservice.entities.Brand;
import com.yagiz.carservice.repository.BrandRepository;

import lombok.AllArgsConstructor;
import main.java.com.yagiz.commonservice.Mapper.ModelMapperService;


@Service
@AllArgsConstructor
public class BrandManager implements BrandService{
    private final BrandRepository repository;
    private final ModelMapperService modelMapperService;
    private BrandBusinessRules rules;

    @Override
    public CreateBrandResponse addBrand(CreateBrandRequest request) {
        var brand=this.modelMapperService.forRequest().map(request, Brand.class);
        brand.setBrandId(0);
        repository.save(brand);
        CreateBrandResponse response=this.modelMapperService.forResponse().map(request, CreateBrandResponse.class);
        return response;
    }

    @Override
    public GetBrandResponse getBrandById(int brandId) {
        rules.checkIfBrandNotExists(brandId);
        var brand = repository.findById(brandId).orElseThrow();
        var response =this.modelMapperService.forResponse().map(brand, GetBrandResponse.class);
        return response;
    }

    @Override
    public List<GetBrandListResponse> getBrandList() {
        List<Brand> brandList=repository.findAll();
        List<GetBrandListResponse> response=brandList.stream().map(brand-> modelMapperService.forResponse().map(brand, GetBrandListResponse.class)).toList();
        return response;
    }

    @Override
    public UpdateBrandResponse updateBrand(int id, UpdateBrandRequest request) {
        rules.checkIfBrandNotExists(id);
        var brand=modelMapperService.forRequest().map(request,Brand.class);
        brand.setBrandId(id);
        repository.save(brand);
        var response=modelMapperService.forResponse().map(brand, UpdateBrandResponse.class);
        return response;
    }

    @Override
    public void deleteById(int id) {
        rules.checkIfBrandNotExists(id);
        repository.deleteById(id);
    }
}
