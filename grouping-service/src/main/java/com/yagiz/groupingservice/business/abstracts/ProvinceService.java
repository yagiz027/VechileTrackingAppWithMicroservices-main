package com.yagiz.groupingservice.business.abstracts;

import java.util.List;

import com.yagiz.groupingservice.business.dto.responses.get.GetProvinceById;
import com.yagiz.groupingservice.business.dto.responses.get.GetProvinceList;

public interface ProvinceService {
    GetProvinceById getById(int id);
    List<GetProvinceList> getProvinceList();
}
