package com.yagiz.groupingservice.business.dto.responses.update;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateAreaResponse {
    private UUID id;
    private String name;
}