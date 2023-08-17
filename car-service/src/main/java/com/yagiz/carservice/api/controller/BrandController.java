package com.yagiz.carservice.api.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    public GetBrandResponse getBrandById(@PathVariable UUID brandId){
        return brandService.getBrandById(brandId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateBrandResponse addBrand(@Valid @RequestBody CreateBrandRequest request){
        return brandService.addBrand(request);
    }

    @PutMapping("/{brandId}")
    @ResponseStatus(HttpStatus.OK)
    public UpdateBrandResponse updateBrand(@PathVariable UUID brandId,@RequestBody UpdateBrandRequest request){
        return brandService.updateBrand(brandId, request);
    }

    @DeleteMapping("/{brandId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable UUID brandId){
        brandService.deleteById(brandId);
    }
}
