package com.yagiz.groupingservice.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yagiz.commonservice.Mapper.ModelMapperService;
import com.yagiz.groupingservice.business.abstracts.ProvinceService;
import com.yagiz.groupingservice.business.dto.responses.get.GetProvinceById;
import com.yagiz.groupingservice.business.dto.responses.get.GetProvinceList;
import com.yagiz.groupingservice.business.rules.ProvinceBusinessRules;
import com.yagiz.groupingservice.entity.Province;
import com.yagiz.groupingservice.repository.ProvinceRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProvinceManager implements ProvinceService {
    private final ProvinceRepository repository;
    private final ModelMapperService modelMapperService;
    private final ProvinceBusinessRules rules;

    @Override
    public GetProvinceById getById(int id) {
        rules.checkIfProvinceNotExists(id);
        Province province=repository.findById(id).orElseThrow();
        GetProvinceById response=modelMapperService.forResponse().map(province, GetProvinceById.class);
        return response;
    }
    @Override
    public List<GetProvinceList> getProvinceList() {
        List<Province> provinces=repository.findAll();
        List<GetProvinceList> responses = provinces.stream().map(province-> modelMapperService.forResponse().map(province, GetProvinceList.class)).toList();
        return responses;
    }    
}
