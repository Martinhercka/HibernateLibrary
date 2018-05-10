package hibernate.entity;

import javax.persistence.*;


@Entity
@Table(name = "cars")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "year")
    private long year;
    @Column(name = "idw")
    private long idw;

    public Book() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}