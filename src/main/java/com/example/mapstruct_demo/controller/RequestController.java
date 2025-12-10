package com.example.mapstruct_demo.controller;

import com.example.mapstruct_demo.dto.SampleRequestWrapper;
import com.example.mapstruct_demo.service.RequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RequestController {

    private final RequestService service;

    public RequestController(RequestService service) {
        this.service = service;
    }

    @GetMapping("/request/{applicantId}")
    public ResponseEntity<List<SampleRequestWrapper>> getRequest(@PathVariable String applicantId) {
        List<SampleRequestWrapper> payload = service.buildRequest(applicantId);
        return ResponseEntity.ok(payload);
    }
}
