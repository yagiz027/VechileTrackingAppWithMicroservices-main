package com.yagiz.carservice.api.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import com.yagiz.carservice.business.abstracts.ModelService;
import com.yagiz.carservice.business.dto.reponses.create.CreateModelResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetModelListResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetModelResponse;
import com.yagiz.carservice.business.dto.reponses.update.UpdateModelResponse;
import com.yagiz.carservice.business.dto.requests.create.CreateModelRequest;
import com.yagiz.carservice.business.dto.requests.update.UpdateModelRequest;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;



@RestController
@RequestMapping("api/models")
@AllArgsConstructor
public class ModelController {
    private final ModelService modelService;

    @GetMapping
    public  List<GetModelListResponse> getModelList() {
        return modelService.getModelList();
    }

    @GetMapping(value="/{modelId}")
    public GetModelResponse getModelById(@PathVariable UUID modelId) {
        return modelService.getModelById(modelId);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateModelResponse addModel(@Valid @RequestBody CreateModelRequest request){
        return modelService.add(request);
    }

    @PutMapping("/{modelId}")
    @ResponseStatus(HttpStatus.OK)
    public UpdateModelResponse updateModel(@PathVariable UUID modelId,@RequestBody UpdateModelRequest request){
        return modelService.update(modelId,request);
    }

    @DeleteMapping("/{modelId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable UUID modelId){
        modelService.deleteById(modelId);
    }
}
