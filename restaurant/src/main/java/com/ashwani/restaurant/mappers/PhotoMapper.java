package com.ashwani.restaurant.mappers;

import com.ashwani.restaurant.domain.dtos.PhotoDto;
import com.ashwani.restaurant.domain.entities.Photo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PhotoMapper {
    PhotoDto toDto(Photo photo);
}
