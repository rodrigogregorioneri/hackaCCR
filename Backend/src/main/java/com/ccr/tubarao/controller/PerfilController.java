package com.ccr.tubarao.controller;

import com.ccr.tubarao.business.PerfilBusiness;
import com.ccr.tubarao.model.PerfilModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/perfil")
public class PerfilController {

    @Autowired
    private PerfilBusiness perfilBusiness;


    @PostMapping
    public PerfilModel createPerfil(@RequestBody PerfilModel perfil){
        return perfilBusiness.createPerfil(perfil);
    }

    @GetMapping
    public List<PerfilModel> listPerfil(){
        return perfilBusiness.listPerfil();
    }

    @GetMapping("/findPerfil/{id}")
    public PerfilModel findByPerfil(@PathVariable(name = "id", required = true) String id){
        return perfilBusiness.findPerfil(id);
    }

}
