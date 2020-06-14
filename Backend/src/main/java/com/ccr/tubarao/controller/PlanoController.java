package com.ccr.tubarao.controller;

import com.ccr.tubarao.business.PerfilBusiness;
import com.ccr.tubarao.business.PlanoBusiness;
import com.ccr.tubarao.model.PerfilModel;
import com.ccr.tubarao.model.PlanoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/plano")
public class PlanoController {

    @Autowired
    private PlanoBusiness planoBusiness;

    @Autowired
    private PerfilBusiness perfilBusiness;

    @PostMapping
    public PlanoModel createPlano(@RequestBody PlanoModel plano){
        PerfilModel perfil = perfilBusiness.findPerfil(plano.getIdPerfil());
        int parcela  = perfilBusiness.getParcelas(plano.getIdPerfil(), plano.getValorDaParcela());
        int valorParcela = (perfil.getValorSonho() / parcela) + 50;
        plano.setCashBack(0);
        plano.setParcelas(parcela);
        plano.setProgressoPlano("Faltam 100 %");
        plano.setStatus("PENDENTE");
        plano.setTempoRestante("Falta "+parcela+" meses");
        plano.setValorDaParcela(valorParcela);
        plano.setValorGuardado(0);
        return planoBusiness.createPlano(plano);
    }

    @GetMapping
    public List<PlanoModel> listPlano(){
        return planoBusiness.listPlano();
    }

    @GetMapping("/findPlano/{id}")
    public PlanoModel findByPlano(@PathVariable(name = "id", required = true) String id){
        return planoBusiness.findPlano(id);
    }




}
