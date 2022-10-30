package com.mihailstoica.dropandsee.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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
    @NotNull(message = "{dropandsee.constraints.username.NotNull.message}")
    @Size(min = 4, max = 255)
    private String userName;

    @Column(name = "display_name")
    @NotNull(message = "{dropandsee.constraints.displayname.NotNull.message}")
    @Size(min = 4, max = 255)
    private String displayName;

    @Column(name = "password")
    @NotNull(message = "{dropandsee.constraints.password.NotNull.message}")
    @Size(min = 8, max = 255)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message= "{dropandsee.constraints.password.Pattern.message}")
    private String password;

}
