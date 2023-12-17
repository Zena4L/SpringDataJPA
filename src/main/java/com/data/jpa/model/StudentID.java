package com.data.jpa.model;

import com.data.jpa.model.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "StudentID")
@Table(
        name = "studentId",
        uniqueConstraints = {
                @UniqueConstraint(name = "student_card_number_unique", columnNames = "card_number")
        }

)
public class StudentID {

    @Id
    @SequenceGenerator(
            name = "card_sequence",
            sequenceName = "card_sequence",
            allocationSize = 1
    )
   @GeneratedValue(
           strategy = SEQUENCE,
           generator = "card_sequence"
   )
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "card_number", nullable = false,length = 15, columnDefinition = "TEXT")
    private String cardNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id",referencedColumnName = "id",foreignKey = @ForeignKey(name = "student_id_fk"))
    private Student student;

}
