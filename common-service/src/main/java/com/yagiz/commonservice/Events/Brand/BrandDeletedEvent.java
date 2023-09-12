package com.yagiz.commonservice.Events.Brand;

import com.yagiz.commonservice.Events.Event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BrandDeletedEvent implements Event {
    private int brandId;
}
