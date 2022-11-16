package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "\"post\"")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, columnDefinition = "Text")
    @NonNull
    private String text;

    @Column
    private Date created_at = new Date();

    @JoinColumn(name = "user_id",nullable = false)
    @NonNull
    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "post")

    private List<Comment> nComments;

}
