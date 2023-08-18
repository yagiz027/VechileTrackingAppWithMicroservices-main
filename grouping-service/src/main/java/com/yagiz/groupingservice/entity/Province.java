package com.yagiz.groupingservice.entity;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
    @Id
    @Column(name="id")
    private int id;
    @Length(min=3,max=20)
    private String name;
    private int postalCode;

    @OneToMany(mappedBy = "groups")
    private List<Group> groups;

    @OneToMany(mappedBy = "areas")
    private List<Area> areas;
}
