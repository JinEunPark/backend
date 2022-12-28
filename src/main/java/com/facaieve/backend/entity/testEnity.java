package com.facaieve.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
public class testEnity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "test")
    String testId;
}
