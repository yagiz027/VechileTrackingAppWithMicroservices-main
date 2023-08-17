package com.yagiz.carservice.business.abstracts;

import java.util.List;
import java.util.UUID;

import com.yagiz.carservice.business.dto.reponses.create.CreateModelResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetModelListResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetModelResponse;
import com.yagiz.carservice.business.dto.reponses.update.UpdateModelResponse;
import com.yagiz.carservice.business.dto.requests.create.CreateModelRequest;
import com.yagiz.carservice.business.dto.requests.update.UpdateModelRequest;


public interface ModelService {
    CreateModelResponse add(CreateModelRequest request);
    UpdateModelResponse update(UUID id,UpdateModelRequest request);
    GetModelResponse getModelById(UUID id);
    List<GetModelListResponse> getModelList();
    void deleteById(UUID id);
}
