package com.hackaprev.app.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class PerfilModel {

    @Id
    private String id;

    private String nome;

    private String sobrenome;

    private int idade;

    private String tipoSonho;

    private int valorSonho;

    private int qtdAnos;

    private int parcelas;

}
