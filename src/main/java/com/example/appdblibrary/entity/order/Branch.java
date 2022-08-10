package com.example.appdblibrary.entity.order;

import com.example.appdblibrary.entity.template.AbsLongEntity;
import com.example.appdblibrary.entity.users.Address;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "branch")
@Getter
@Setter
@ToString
public class Branch extends AbsLongEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Address address;

    @Temporal(TemporalType.TIME)
    private Date startWorkingTime;

    @Temporal(TemporalType.TIME)
    private Date endWorkingTime;

    @Column(nullable = false)
    private String branchPhoneNumber;    // filialning nomeri

    public Branch(Address address, Date startTime, Date endTime, String branchPhoneNumber) {
        this.address = address;
        this.startWorkingTime = startTime;
        this.endWorkingTime = endTime;
        this.branchPhoneNumber = branchPhoneNumber;
    }

    public Branch(String address, java.util.Date startTime, java.util.Date endTime, String branchPhoneNumber) {


    }

    public void setAddress(String address) {

    }

}
