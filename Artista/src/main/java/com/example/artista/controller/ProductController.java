package com.example.artista.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class ProductController {
    @GetMapping("/product/{id}")
    public String GetProduct(@PathVariable Long id){
        return "product";

    }

    @GetMapping("products")
    public String GetProducts(){
        return "products";

    }


    @PostMapping("product")
    public String CreateProduct(){
        return "products";

    }


    @PutMapping("product/{id}")
    public String updateProduct(@PathVariable String id){
         return "update products";
    }

}
