package nk.crud.crud.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "Customers")
public class Customer {

    @Id
//    @GeneratedValue
    @EqualsAndHashCode.Include
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String dateOfBirth;

    @Column
    private String gender;

    public Customer() {
    }

    public Customer(Long id, String firstName, String lastName, String dateOfBirth, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
}