package com.sbep.SBEP.Entity;

import javax.persistence.*;

@Entity
public class SaliEvenimente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSala(Sali sala) {
        this.sala = sala;
    }

    public void setEveniment(Evenimente eveniment) {
        this.eveniment = eveniment;
    }

    public Sali getSala() {
        return sala;
    }

    public Evenimente getEveniment() {
        return eveniment;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sala")
    private Sali sala;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_eveniment")
    private Evenimente eveniment;
}
