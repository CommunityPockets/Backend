package org.communitypockets.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue
    private long id;

    @Size(min = 1, max = 4096)
    private String body;

    @ManyToOne
    private User user;

}
