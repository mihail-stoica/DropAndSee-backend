package com.mihailstoica.dropandsee.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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

    @Column(name = "user_name")
    @NotNull
    private String userName;

    @Column(name = "display_name")
    @NotNull
    private String displayName;

    @Column(name = "password")
    @NotNull
    private String password;

}
