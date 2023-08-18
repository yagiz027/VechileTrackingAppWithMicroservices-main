package com.yagiz.carservice.entities;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Cars")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID carId;
    private String plate;

    @Length(min = 17, max = 17, message = "The chassis number must be equal to 17 characters")
    private String ChassisNumber;
    private String tag;

    @ManyToOne
    @JoinColumn(name = "modelId")
    private Model model;
}
