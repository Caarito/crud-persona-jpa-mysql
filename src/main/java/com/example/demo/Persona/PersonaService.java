package com.example.demo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {
     @Autowired
     PersonaRepository personaRepo;

    public Persona crearPersona(Persona persona){
        return personaRepo.save(persona);
    }

    public List<Persona> obtenerTodasLasPersonas(){
        return personaRepo.findAll();
    }

    public Optional<Persona> obtenerPersonaPorId(Integer id){
        return personaRepo.findById(id);
    }

    public void eliminarPersonaPorId(Integer id){
        personaRepo.deleteById(id);
    }

    public void modificarPersona(Persona persona){
        personaRepo.save(persona);
    }


}

