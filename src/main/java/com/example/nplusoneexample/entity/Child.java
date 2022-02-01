package com.example.nplusoneexample.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long childId;

    private String text;

    private String role;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Parent> parents;
    
}
