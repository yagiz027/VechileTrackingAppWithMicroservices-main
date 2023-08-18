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
    public GetModelResponse getModelById(@PathVariable int modelId) {
        return modelService.getModelById(modelId);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateModelResponse addModel(@Valid @RequestBody CreateModelRequest request){
        return modelService.add(request);
    }

    @PutMapping("/{modelId}")
    @ResponseStatus(HttpStatus.OK)
    public UpdateModelResponse updateModel(@PathVariable int modelId,@RequestBody UpdateModelRequest request){
        return modelService.update(modelId,request);
    }

    @DeleteMapping("/{modelId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable int modelId){
        modelService.deleteById(modelId);
    }
}
