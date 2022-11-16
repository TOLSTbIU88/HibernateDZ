package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "\"comment\"")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, columnDefinition = "Text")
    @NonNull
    private String text;

    @Column
    private Date created_at = new Date();

    @JoinColumn(name = "post_id",nullable = false)
    @NonNull
    @ManyToOne

    private Post post;

    @JoinColumn(name = "user_id",nullable = false)
    @NonNull
    @ManyToOne

    private User user;

}
