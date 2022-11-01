package com.mihailstoica.dropandsee.viewmodel;

import com.mihailstoica.dropandsee.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserVM {

    private Long id;

    private String username;

    private String displayName;

    private String image;

    public UserVM(User user) {
        this.setId(user.getId());
        this.setUsername(user.getUsername());
        this.setDisplayName(user.getDisplayName());
        this.setImage(user.getImage());
    }

}
