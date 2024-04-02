package com.Corboncell.AuthAPIService.service;


import com.Corboncell.AuthAPIService.model.APIEntry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAPIService {
    List<APIEntry> fetchApis(String Category, Integer limit);
}