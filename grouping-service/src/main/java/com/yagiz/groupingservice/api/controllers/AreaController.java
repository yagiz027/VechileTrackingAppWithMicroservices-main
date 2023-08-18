package com.yagiz.groupingservice.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yagiz.groupingservice.business.abstracts.AreaService;
import com.yagiz.groupingservice.business.dto.requests.create.CreateAreaRequest;
import com.yagiz.groupingservice.business.dto.requests.update.UpdateAreaRequest;
import com.yagiz.groupingservice.business.dto.responses.create.CreateAreaResponse;
import com.yagiz.groupingservice.business.dto.responses.get.GetAreaById;
import com.yagiz.groupingservice.business.dto.responses.get.GetAreaList;
import com.yagiz.groupingservice.business.dto.responses.update.UpdateAreaResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "api/areas")
@AllArgsConstructor
public class AreaController {
    private AreaService service;
    
    @GetMapping("/{id}")
    public GetAreaById getById(int id){
        return service.getById(id);
    }

    @GetMapping
    public List<GetAreaList> getAreaList(){
        return service.getAreaList();
    }

    @PostMapping()
    public CreateAreaResponse addArea(@RequestBody CreateAreaRequest request){
        return service.addArea(request);
    }

    @PutMapping("/{id}")
    public UpdateAreaResponse updateArea(@PathVariable int id, @RequestBody UpdateAreaRequest request){
        return service.updateArea(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        service.deleteById(id);
    }
}
