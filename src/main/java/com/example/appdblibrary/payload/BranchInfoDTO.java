package com.example.appdblibrary.payload;

import com.example.appdblibrary.entity.users.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.fastfoodapplicationg5.entity.users.Address;

import java.sql.Time;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BranchInfoDTO {


    private Date startTime;

    private Date endTime;

    private Address address;

    private String branchPhoneNumber;


    public BranchInfoDTO(java.sql.Date startWorkingTime, java.sql.Date endWorkingTime, Address address, String branchPhoneNumber) {
    }
}
