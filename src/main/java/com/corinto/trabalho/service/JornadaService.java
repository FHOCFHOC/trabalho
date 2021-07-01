package com.corinto.trabalho.service;

import com.corinto.trabalho.model.JornadaTrabalho;
import com.corinto.trabalho.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {


    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
       return jornadaRepository.save(jornadaTrabalho);

    }

    public List<JornadaTrabalho> findAll() {
       return   jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);

    }

    public void deleteJornada(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }

    @SpringBootApplication
    public static class TrabalhoApplication {

        public static void main(String[] args) {
            SpringApplication.run(TrabalhoApplication.class, args);
        }

    }
}
