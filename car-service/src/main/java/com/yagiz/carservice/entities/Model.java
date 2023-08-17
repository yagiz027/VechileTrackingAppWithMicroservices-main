package com.yagiz.carservice.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Models")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID modelId;
    private String modelName;
    //@NotFutureYear
    private int modelYear;
    @ManyToOne
    @JoinColumn(name = "brandId")
    private Brand brand;
    
    @OneToMany(mappedBy = "model",cascade = CascadeType.ALL)
    private List<Car> cars;
}
