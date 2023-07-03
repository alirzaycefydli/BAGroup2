package WWSIS.BAGroup2.entity;

import javax.persistence.*;

@Entity
@Table(name = "authors")
public class AuthorEntity {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
}