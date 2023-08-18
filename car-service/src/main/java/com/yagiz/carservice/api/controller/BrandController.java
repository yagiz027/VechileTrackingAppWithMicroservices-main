package com.yagiz.carservice.api.controller;

import java.util.List;

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

import com.yagiz.carservice.business.abstracts.BrandService;
import com.yagiz.carservice.business.dto.reponses.create.CreateBrandResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetBrandListResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetBrandResponse;
import com.yagiz.carservice.business.dto.reponses.update.UpdateBrandResponse;
import com.yagiz.carservice.business.dto.requests.create.CreateBrandRequest;
import com.yagiz.carservice.business.dto.requests.update.UpdateBrandRequest;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/brands")
@AllArgsConstructor
public class BrandController {
    private final BrandService brandService;

    @GetMapping
    public List<GetBrandListResponse> getAllBrands(){
        return brandService.getBrandList();
    }

    @GetMapping("/{brandId}")
    public GetBrandResponse getBrandById(@PathVariable int brandId){
        return brandService.getBrandById(brandId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateBrandResponse addBrand(@Valid @RequestBody CreateBrandRequest request){
        return brandService.addBrand(request);
    }

    @PutMapping("/{brandId}")
    @ResponseStatus(HttpStatus.OK)
    public UpdateBrandResponse updateBrand(@PathVariable int brandId,@RequestBody UpdateBrandRequest request){
        return brandService.updateBrand(brandId, request);
    }

    @DeleteMapping("/{brandId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable int brandId){
        brandService.deleteById(brandId);
    }
}
