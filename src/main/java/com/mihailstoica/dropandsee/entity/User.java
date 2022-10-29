package com.mihailstoica.dropandsee.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(
        name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_name"})}
)
public class User {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "display_name", nullable = false)
    private String displayName;

    @Column(name = "password", nullable = false)
    private String password;

}
