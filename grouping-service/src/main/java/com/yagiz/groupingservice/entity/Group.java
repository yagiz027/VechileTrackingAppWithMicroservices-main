package com.yagiz.groupingservice.entity;

import java.util.List;
import java.util.UUID;

import com.yagiz.carservice.entities.Car;

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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "provinceId")
    private Province province;

    @ManyToOne
    @JoinColumn(name = "areaId")
    private Area area;

    @ManyToOne
    @JoinColumn(name="groupId")
    private Group group;
    
    @OneToMany(mappedBy = "groups")
    private List<Group> childGroups;

    @OneToMany(mappedBy = "cars")
    private List<Car> cars;

}
