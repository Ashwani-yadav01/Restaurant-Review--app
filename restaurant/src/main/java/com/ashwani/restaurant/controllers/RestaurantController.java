package com.ashwani.restaurant.controllers;

import com.ashwani.restaurant.domain.RestaurantCreateUpdateRequest;
import com.ashwani.restaurant.domain.dtos.RestaurantCreateUpdateRequestDto;
import com.ashwani.restaurant.domain.dtos.RestaurantDto;
import com.ashwani.restaurant.domain.entities.Restaurant;
import com.ashwani.restaurant.mappers.RestaurantMapper;
import com.ashwani.restaurant.servieces.RestaurantService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/restaurants")
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantService restaurantService;
    private final RestaurantMapper restaurantMapper;

    public ResponseEntity<RestaurantDto> createRestaurant(
            @Valid @RequestBody RestaurantCreateUpdateRequestDto request
            ){
        RestaurantCreateUpdateRequest restaurantCreateUpdateRequest = restaurantMapper
                .toRestaurantCreateUpdateRequest(request);
        Restaurant restaurant = restaurantService.createRestaurant(restaurantCreateUpdateRequest);
        RestaurantDto createdRestaurantDto = restaurantMapper.toRestaurantDto(restaurant);
        return ResponseEntity.ok(createdRestaurantDto);
    }
}
