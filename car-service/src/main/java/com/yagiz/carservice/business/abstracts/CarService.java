package com.yagiz.carservice.business.abstracts;

import java.util.List;

import com.yagiz.carservice.business.dto.reponses.create.CreateCarResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetCarListResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetCarResponse;
import com.yagiz.carservice.business.dto.reponses.update.UpdateCarResponse;
import com.yagiz.carservice.business.dto.requests.create.CreateCarRequest;
import com.yagiz.carservice.business.dto.requests.update.UpdateCarRequest;


public interface CarService {
    CreateCarResponse add(CreateCarRequest request);
    UpdateCarResponse update(int carId,UpdateCarRequest request);
    GetCarResponse getCarById(int id);
    List<GetCarListResponse> getCarList();
    void deleteById(int id);
}
