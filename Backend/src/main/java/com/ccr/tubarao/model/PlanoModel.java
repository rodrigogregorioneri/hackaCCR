package com.hackaprev.app.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class PlanoModel {

    @Id
    private String id;

    private int valorGuardado;

    private String idPerfil;

    private String tempoRestante;

    private String progressoPlano;

    private int parcelas;

    private int valorDaParcela;

    private int cashBack;

    private String status;


}
