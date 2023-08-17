package com.yagiz.carservice.business.abstracts;

import java.util.List;
import java.util.UUID;

import com.yagiz.carservice.business.dto.reponses.create.CreateCarResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetCarListResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetCarResponse;
import com.yagiz.carservice.business.dto.reponses.update.UpdateCarResponse;
import com.yagiz.carservice.business.dto.requests.create.CreateCarRequest;
import com.yagiz.carservice.business.dto.requests.update.UpdateCarRequest;


public interface CarService {
    CreateCarResponse add(CreateCarRequest request);
    UpdateCarResponse update(UUID carId,UpdateCarRequest request);
    GetCarResponse getCarById(UUID id);
    List<GetCarListResponse> getCarList();
    void deleteById(UUID id);
}
