package com.mzoz.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String body;

    @ManyToOne
    @JoinColumn(name = "link")
    private Link link;
}
