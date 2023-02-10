package com.example.cymarkdelivery.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseModel{

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

//    @Column(name = "address", nullable = false)
    @PrimaryKeyJoinColumn(name="id")
    @OneToOne
    private Address address;

    @Column(name = "profile-image", nullable = false)
    private String profilePicture;

}
