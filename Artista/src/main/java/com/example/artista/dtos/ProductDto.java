package com.example.artista.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDto extends BaseClassDto {
    private String title;
    private String category;
    private double price;
    private String image;
    private String description;



}
