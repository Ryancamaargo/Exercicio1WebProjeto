package br.edu.utfpr.webExercicio1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@Table(name = "receituario")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Receituario {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "observacao")
    private String observacao;

    @OneToOne()
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @OneToOne()
    @JoinColumn(name = "id_doenca")
    private Doenca doenca;


}

