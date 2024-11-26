package com.stark.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "postx")
public class Post {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false, length = 4000)
    private String description;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Comment> comments;

}