package com.yagiz.carservice.business.abstracts;

import java.util.List;

import com.yagiz.carservice.business.dto.reponses.create.CreateModelResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetModelListResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetModelResponse;
import com.yagiz.carservice.business.dto.reponses.update.UpdateModelResponse;
import com.yagiz.carservice.business.dto.requests.create.CreateModelRequest;
import com.yagiz.carservice.business.dto.requests.update.UpdateModelRequest;


public interface ModelService {
    CreateModelResponse add(CreateModelRequest request);
    UpdateModelResponse update(int id,UpdateModelRequest request);
    GetModelResponse getModelById(int id);
    List<GetModelListResponse> getModelList();
    void deleteById(int id);
}
