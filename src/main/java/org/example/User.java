package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name =  "\"user\"")
@Data
@NoArgsConstructor
@RequiredArgsConstructor

public class User {
    @Id
    @Column (unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;


    @Column (unique = true,nullable = false)
    @NonNull

    private String name;

    @Column (nullable = false)
    @NonNull

    private String password;

    @Column
    private Date created_at = new Date();

    @OneToMany(mappedBy = "user")
    private List<Post> nPosts;

    @OneToMany(mappedBy = "user")
    private List<Comment> nComments;

}
