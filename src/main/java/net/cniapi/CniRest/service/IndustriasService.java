package net.cniapi.CniRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.cniapi.CniRest.models.Industrias;
import net.cniapi.CniRest.models.IndustriasRepository;

@Service
@Transactional
public class IndustriasService {

    @Autowired
    private IndustriasRepository repo;
     
    public List<Industrias> listAll() {
        return repo.findAll();
    }
     
    public void save(Industrias industria) {
        repo.save(industria);
    }
     
    public Optional<Industrias> get(Integer id) {
        return  repo.findById(id);
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
