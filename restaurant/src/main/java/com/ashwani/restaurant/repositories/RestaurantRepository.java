package com.ashwani.restaurant.repositories;

import com.ashwani.restaurant.domain.entities.Restaurant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RestaurantRepository extends ElasticsearchRepository<Restaurant, String> {
}
