package com.yagiz.groupingservice.business.abstracts;

import java.util.List;

import com.yagiz.groupingservice.business.dto.requests.create.CreateAreaRequest;
import com.yagiz.groupingservice.business.dto.requests.update.UpdateAreaRequest;
import com.yagiz.groupingservice.business.dto.responses.create.CreateAreaResponse;
import com.yagiz.groupingservice.business.dto.responses.get.GetAreaById;
import com.yagiz.groupingservice.business.dto.responses.get.GetAreaList;
import com.yagiz.groupingservice.business.dto.responses.update.UpdateAreaResponse;

public interface AreaService {
    GetAreaById getById(int id);
    List<GetAreaList> getAreaList();
    CreateAreaResponse addArea(CreateAreaRequest request);
    UpdateAreaResponse updateArea(int id,UpdateAreaRequest request);
    void deleteById(int id);
}
