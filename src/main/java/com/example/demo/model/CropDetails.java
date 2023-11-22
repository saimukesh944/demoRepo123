package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "CropDetails")
public class CropDetails {
    @Id
    private Long id;
    private int farmerId;
    private String cropName;
    private String cropType;
    private String cropCost;
    private String location;




}
