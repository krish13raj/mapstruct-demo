package com.example.mapstruct_demo.service;

import com.example.mapstruct_demo.common.model.entity.CommonAggregate;
import com.example.mapstruct_demo.dto.SampleRequestWrapper;
import com.example.mapstruct_demo.dto.TransactionInput;
import com.example.mapstruct_demo.fico.model.FicoAggregate;
import com.example.mapstruct_demo.mapper.TransactionMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RequestService {

    private final TransactionMapper mapper;

    public RequestService(TransactionMapper mapper) {
        this.mapper = mapper;
    }

    public List<SampleRequestWrapper> buildRequest(String applicantId) {
        // Hypothetical sources
        FicoAggregate fico = fetchFicoData(applicantId);
        CommonAggregate common = fetchCommonData(applicantId);

        Map<String, Object> defaults = Map.of(
                "duplicateCode", "N",
                "channelType", "WEB",
                "dmFlow", "pre-pricing"
        );

        TransactionInput transactionInput = mapper.buildTransactionInput(fico, common, defaults);

        SampleRequestWrapper wrapper = new SampleRequestWrapper();
        wrapper.setName("TransactionInput");
        wrapper.setValue(transactionInput);

        return List.of(wrapper);
    }

    // Dummy methods to represent external sources
    private FicoAggregate fetchFicoData(String applicantId) {
        FicoAggregate a = new FicoAggregate();
        a.setTimestamp("2025-05-01T16:22:44.630Z");
        a.setBomVersionId("2.1");
        // fill fields as needed (or leave null to test defaults)
        return a;
    }

    private CommonAggregate fetchCommonData(String applicantId) {
        CommonAggregate c = new CommonAggregate();
        // fill fields as needed from Mongo
        return c;
    }
}
