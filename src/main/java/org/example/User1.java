package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user1")
@Data
@NoArgsConstructor
@RequiredArgsConstructor

public class User1 {
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

    private String date;

    

}
