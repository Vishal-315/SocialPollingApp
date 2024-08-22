package com.socialpollingapp.model;

import javax.persistence.*;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "poll_id")
    private List<Option> options;

    private Long totalVotes;
}
