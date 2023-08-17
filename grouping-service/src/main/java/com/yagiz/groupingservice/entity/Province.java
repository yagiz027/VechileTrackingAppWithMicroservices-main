package com.yagiz.groupingservice.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="provinces")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Province {
    private int id;
    @Length(min=3,max=20)
    private String name;
    private int postalCode;
}
