package br.edu.utfpr.webExercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;


@Entity
@Data
@Table(name="cuidadosminimos")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class CuidadosMinimos {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_doenca")
    private Doenca doenca ;

    @Column(name = "descricao")
    private String descricao;





}