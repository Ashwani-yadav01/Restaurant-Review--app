package com.ashwani.restaurant.servieces;

import com.ashwani.restaurant.domain.RestaurantCreateUpdateRequest;
import com.ashwani.restaurant.domain.entities.Restaurant;

public interface RestaurantService {
    Restaurant createRestaurant(RestaurantCreateUpdateRequest request);

}
