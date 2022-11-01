package com.mihailstoica.dropandsee.entity;

import com.mihailstoica.dropandsee.validator.UniqueUsername;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.beans.Transient;
import java.util.Collection;

@Data
@Entity
@Table(name = "users")
public class User implements UserDetails {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @Column(name = "user_name")
    @NotNull(message = "{dropandsee.constraints.username.NotNull.message}")
    @Size(min = 4, max = 255)
    @UniqueUsername
    private String username;

    @Column(name = "display_name")
    @NotNull(message = "{dropandsee.constraints.displayname.NotNull.message}")
    @Size(min = 4, max = 255)
    private String displayName;

    @Column(name = "password")
    @NotNull(message = "{dropandsee.constraints.password.NotNull.message}")
    @Size(min = 8, max = 255)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message= "{dropandsee.constraints.password.Pattern.message}")
    private String password;

    private String image;

    @Override
    @Transient
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList("Role_USER");
    }

    @Override
    @Transient
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @Transient
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @Transient
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @Transient
    public boolean isEnabled() {
        return true;
    }
}
