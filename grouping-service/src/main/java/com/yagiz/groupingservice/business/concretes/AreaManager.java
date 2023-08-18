package com.yagiz.groupingservice.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yagiz.groupingservice.business.abstracts.AreaService;
import com.yagiz.groupingservice.business.dto.requests.create.CreateAreaRequest;
import com.yagiz.groupingservice.business.dto.requests.update.UpdateAreaRequest;
import com.yagiz.groupingservice.business.dto.responses.create.CreateAreaResponse;
import com.yagiz.groupingservice.business.dto.responses.get.GetAreaById;
import com.yagiz.groupingservice.business.dto.responses.get.GetAreaList;
import com.yagiz.groupingservice.business.dto.responses.update.UpdateAreaResponse;
import com.yagiz.groupingservice.business.rules.AreaBusinessRules;
import com.yagiz.groupingservice.entity.Area;
import com.yagiz.groupingservice.repository.AreaRepository;

import lombok.AllArgsConstructor;
import main.java.com.yagiz.commonservice.Mapper.ModelMapperService;

@AllArgsConstructor
@Service
public class AreaManager implements AreaService {
    private AreaRepository repository;
    private ModelMapperService modelMapperService;
    private AreaBusinessRules rules;

    @Override
    public GetAreaById getById(int id) {
        rules.checkIfAreaNotExists(id);
        Area area=repository.findById(id).orElseThrow();
        GetAreaById response=modelMapperService.forResponse().map(area, GetAreaById.class);
        return response;
    }

    @Override
    public List<GetAreaList> getAreaList() {
        List<Area> areas=repository.findAll();
        List<GetAreaList> responses=areas.stream().map(area->modelMapperService.forResponse().map(area, GetAreaList.class)).toList();
        return responses;
    }

    @Override
    public CreateAreaResponse addArea(CreateAreaRequest request) {
        rules.checkIfAreaAlreadyExists(request.getName());
        Area area=modelMapperService.forRequest().map(request, Area.class);
        area.setId(0);
        repository.save(area);
        CreateAreaResponse response=modelMapperService.forResponse().map(area, CreateAreaResponse.class);
        return response;
    }

    @Override
    public UpdateAreaResponse updateArea(int id,UpdateAreaRequest request) {
        rules.checkIfAreaNotExists(id);
        Area area=modelMapperService.forRequest().map(request, Area.class);
        area.setId(id);
        repository.save(area);
        UpdateAreaResponse response=modelMapperService.forResponse().map(area,UpdateAreaResponse.class);
        return response;
    }

    @Override
    public void deleteById(int id) {
        rules.checkIfAreaNotExists(id);
        repository.deleteById(id);
    }
    
}
