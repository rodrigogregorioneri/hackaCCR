package com.ccr.tubarao.business;

import com.ccr.tubarao.model.PerfilModel;
import com.ccr.tubarao.model.PlanoModel;
import com.ccr.tubarao.repository.PerfilRepository;
import com.ccr.tubarao.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanoBusiness {

    @Autowired
    private PlanoRepository planoRepository;

    public PlanoModel createPlano(PlanoModel p) {
        return planoRepository.save(p);
    }

    public List<PlanoModel> listPlano() {
        return planoRepository.findAll();
    }

    public PlanoModel findPlano(String id) {
        return planoRepository.findById(id).get();

    }
}