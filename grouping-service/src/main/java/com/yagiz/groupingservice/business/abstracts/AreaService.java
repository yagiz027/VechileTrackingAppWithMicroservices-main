package com.yagiz.groupingservice.business.abstracts;

import java.util.List;
import java.util.UUID;

import com.yagiz.groupingservice.business.dto.requests.create.CreateAreaRequest;
import com.yagiz.groupingservice.business.dto.requests.update.UpdateAreaRequest;
import com.yagiz.groupingservice.business.dto.responses.create.CreateAreaResponse;
import com.yagiz.groupingservice.business.dto.responses.get.GetAreaById;
import com.yagiz.groupingservice.business.dto.responses.get.GetAreaList;
import com.yagiz.groupingservice.business.dto.responses.update.UpdateAreaResponse;

public interface AreaService {
    GetAreaById getById(UUID id);
    List<GetAreaList> getAreaList();
    CreateAreaResponse addArea(CreateAreaRequest request);
    UpdateAreaResponse updateArea(UUID id,UpdateAreaRequest request);
    void deleteById(UUID id);
}
