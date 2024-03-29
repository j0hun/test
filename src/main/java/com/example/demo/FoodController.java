package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;

    @GetMapping("/api/foods")
    public ResponseEntity<List<Food>> getFoods(){
        List<Food> foods = foodService.getFoods();
        return new ResponseEntity<>(foods, HttpStatus.OK);
    }

}