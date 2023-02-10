package com.example.cymarkdelivery.DTOs;

import com.example.cymarkdelivery.model.Address;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class CustomerResponse {

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "lastname" , nullable = false)
    private String lastName;

    @Column(name = "middle-name" , nullable = false)
    private String middleName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "address", nullable = false)
    @OneToOne
    private Address address;

    @Column(name = "profile-image", nullable = false)
    private String profilePicture;


}
