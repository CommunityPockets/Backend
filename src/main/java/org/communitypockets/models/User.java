package org.communitypockets.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Size(min = 4, max = 30)
    @Column(name = "display_name")
    private String displayName;

    @NotNull
    @Size(max = 4096)
    private String biography;

    @Column(name = "image_path")
    private String imagePath;

    @NotNull
    @Column(name = "created_at")
    private Date createdAt;

    @NotNull
    private boolean disabled;

    @NotNull
    @Size(min = 4, max = 30)
    private String username;

    @NotNull
    @Size(min = 6, max = 24)
    private String password;

    @PrePersist
    void preInsert() {
        this.createdAt = new Date();
        this.disabled = false;
    }

}
