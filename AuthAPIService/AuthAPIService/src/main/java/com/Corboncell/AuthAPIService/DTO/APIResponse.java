package com.Corboncell.AuthAPIService.DTO;

import com.Corboncell.AuthAPIService.model.APIEntry;

import lombok.Data;

import java.util.List;
@Data
public class APIResponse {
    private int count;
    private List<APIEntry> entries;
}
