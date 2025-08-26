package com.ashwani.restaurant.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDto {
    @NotBlank(message = "Street Number is required")
    @Pattern(regexp = "^[0-9]{1,5}[a-zA-Z]?$",message = "invalid street number format")
    private String streetNumber;
    @NotBlank(message = "Street Name is required")
    private String streetName;

    private String unit;
    @NotBlank(message = "City name is required")
    private String city;
    @NotBlank(message = "State name is required")
    private String state;
    @NotBlank(message = "Postal code is required")
    private String postalCode;
    @NotBlank(message = "Country name is required")
    private String country;
}
