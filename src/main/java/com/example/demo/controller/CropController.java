package com.example.demo.controller;

import com.example.demo.model.CropDetails;

import com.example.demo.repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class CropController {
    @Autowired
    private CropRepository cropRepository;

    @PostMapping("/save")
    public CropDetails save(@RequestBody @Validated  CropDetails cropDetails){
        return this.cropRepository

    }
//    @GetMapping("crop/{id}")
//
//    pub
//


}
