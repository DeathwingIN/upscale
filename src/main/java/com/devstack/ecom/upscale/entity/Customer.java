package com.devstack.ecom.upscale.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//This is an entity class that maps to the customer table in the database
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Data // @Data is a Lombok annotation that generates getters, setters, toString, equals, and hashCode methods for the fields of the class.
//Don't Use it with entity it affects the performance in enterprise applications

@Entity (name = "customer")
public class Customer {
    @Id
    @Column (name = "property_id", nullable = false, length = 80) //If we didn't specify the column name it will take the variable name as column name
    private String propertyId;


    @Column (name = "name", nullable = false, length = 45)
    private String name;

    @Column (name = "email", nullable = false, length = 100, unique = true)
    private String email;

    @Column (name = "phone", nullable = false, length = 15)
    private String phone;

    @Column (name = "address", nullable = false, length = 255)
    private String address;

    @Column (name = "is_active", columnDefinition = "TINYINT")
    private Boolean isActive;

}
