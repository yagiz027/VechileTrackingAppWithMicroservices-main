package com.yagiz.carservice.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yagiz.carservice.business.abstracts.ModelService;
import com.yagiz.carservice.business.dto.reponses.create.CreateModelResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetModelListResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetModelResponse;
import com.yagiz.carservice.business.dto.reponses.update.UpdateModelResponse;
import com.yagiz.carservice.business.dto.requests.create.CreateModelRequest;
import com.yagiz.carservice.business.dto.requests.update.UpdateModelRequest;
import com.yagiz.carservice.business.rules.ModelBusinessRules;
import com.yagiz.carservice.entities.Model;
import com.yagiz.carservice.repository.ModelRepository;

import lombok.AllArgsConstructor;
import main.java.com.yagiz.commonservice.Mapper.ModelMapperService;

@AllArgsConstructor
@Service
public class ModelManager implements ModelService {
    private ModelRepository repository;
    private ModelBusinessRules rules;
    private ModelMapperService modelMapperService;
    
    @Override
    public CreateModelResponse add(CreateModelRequest request) {
        var model=this.modelMapperService.forRequest().map(request, Model.class);
        model.setId(0);
        repository.save(model);
        var response=this.modelMapperService.forResponse().map(model, CreateModelResponse.class);
        return response;
    }

    @Override
    public UpdateModelResponse update(int modelId, UpdateModelRequest request) {
        rules.checkIfModelNotExsist(modelId);
        var model=modelMapperService.forRequest().map(request, Model.class);
        model.setId(modelId);
        repository.save(model);
        var response=modelMapperService.forResponse().map(model, UpdateModelResponse.class);
        return response;
    }

    @Override
    public GetModelResponse getModelById(int id) {
        rules.checkIfModelNotExsist(id);
        var model=repository.findById(id).orElseThrow();
        var response=this.modelMapperService.forResponse().map(model, GetModelResponse.class);
        return response;
    }

    @Override
    public List<GetModelListResponse> getModelList() {
        List<Model> models=repository.findAll();
        List<GetModelListResponse> responses=models.stream().map(model->this.modelMapperService.forResponse().map(model,GetModelListResponse.class)).toList();
        return responses;
    }

    @Override
    public void deleteById(int id) {
        rules.checkIfModelNotExsist(id);
        repository.deleteById(id);
    }
}
