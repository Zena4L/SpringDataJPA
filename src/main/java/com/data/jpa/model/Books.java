package com.data.jpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "book")
@Table(name = "book")
public class Books {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "book_sequence"
    )
    @Column(name = "id", updatable = false)
    private Long id;
    @Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP WITHOUT ZONE")
    private LocalDate createdAt;
    @Column(name = "book_name", nullable = false)
    private String bookName;

    @JoinColumn(name = "student_id",referencedColumnName = "id", foreignKey = @ForeignKey(
            name = "student_book_fk"
    ))
    private Student student;
}
