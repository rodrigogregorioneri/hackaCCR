package com.ccr.tubarao.business;

import com.ccr.tubarao.model.PerfilModel;
import com.ccr.tubarao.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilBusiness {

    @Autowired
    private PerfilRepository perfilRepository;

    public PerfilModel createPerfil(PerfilModel p){
        return perfilRepository.save(p);
    }

    public List<PerfilModel> listPerfil(){
        return perfilRepository.findAll();
    }

    public PerfilModel findPerfil(String id){
        return perfilRepository.findById(id).get();
    }

    public int getParcelas(String id, int valorApagar){
        int valorSonho = findPerfil(id).getValorSonho();
        return valorSonho / valorApagar;
    }


}
