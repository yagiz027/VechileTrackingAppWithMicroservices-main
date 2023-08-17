package com.yagiz.carservice.business.abstracts;

import java.util.List;
import java.util.UUID;

import com.yagiz.carservice.business.dto.reponses.create.CreateBrandResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetBrandListResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetBrandResponse;
import com.yagiz.carservice.business.dto.reponses.update.UpdateBrandResponse;
import com.yagiz.carservice.business.dto.requests.create.CreateBrandRequest;
import com.yagiz.carservice.business.dto.requests.update.UpdateBrandRequest;

public interface BrandService {
    CreateBrandResponse addBrand(CreateBrandRequest request);
    GetBrandResponse getBrandById(UUID brandId);
    List<GetBrandListResponse> getBrandList();
    UpdateBrandResponse updateBrand(UUID id,UpdateBrandRequest request);
    void deleteById(UUID id);
}
