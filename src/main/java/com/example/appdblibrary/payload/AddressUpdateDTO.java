package com.example.appdblibrary.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressUpdateDTO {

    private Double lat;

    private Double lon;

    private String fullAddress;

    private Long districtId;

}
