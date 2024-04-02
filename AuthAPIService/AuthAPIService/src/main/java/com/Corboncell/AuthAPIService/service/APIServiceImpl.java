package com.Corboncell.AuthAPIService.service;

import com.Corboncell.AuthAPIService.DTO.APIResponse;

import com.Corboncell.AuthAPIService.model.APIEntry;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class APIServiceImpl implements IAPIService{
    public List<APIEntry> fetchApis(String Category, Integer limit) {
        RestTemplate restTemplate = new RestTemplate();
        String API_URL = "https://api.publicapis.org/entries";
        APIResponse response = restTemplate.getForObject(API_URL, APIResponse.class);

        if (response == null || response.getEntries() == null) {
            return Collections.emptyList();
        }

        List<APIEntry> filteredList = response.getEntries().stream()
                .filter(api -> Category == null || (api.getCategory() != null && api.getCategory().equalsIgnoreCase(Category)))
                .limit(limit == null ? Long.MAX_VALUE : limit)
                .collect(Collectors.toList());

        return filteredList;
    }

}
