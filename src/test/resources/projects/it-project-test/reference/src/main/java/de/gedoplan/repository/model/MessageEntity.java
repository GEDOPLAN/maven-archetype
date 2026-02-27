package de.gedoplan.repository.model;

import lombok.Data;
import jakarta.persistence.*;


@Data
@Entity
@Table(name = "MESSAGES")
public class MessageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
}
