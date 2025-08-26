package com.ashwani.restaurant.servieces;

import com.ashwani.restaurant.domain.GeoLocation;
import com.ashwani.restaurant.domain.entities.Address;

public interface GeoLocationService {
    GeoLocation geoLocate(Address address);
}
