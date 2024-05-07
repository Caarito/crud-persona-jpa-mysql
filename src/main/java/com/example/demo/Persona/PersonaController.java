package com.example.demo.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class PersonaController {
    @Autowired
    PersonaService personaServi;

    @PostMapping("/crearpersona") //URL POST
    public void createPersona(@RequestBody Persona persona){
        personaServi.crearPersona(persona);
    }

    @GetMapping("/obtenertodaslaspersonas") //URL GET
    @ResponseBody
    public List<Persona> getAllPersonas(){
        return personaServi.obtenerTodasLasPersonas();
    }

    @DeleteMapping("/eliminarpersonaporid/{id}") //URL DELETE
    public void deletePersona(@PathVariable Integer id){
        personaServi.eliminarPersonaPorId(id);
    }

    @GetMapping("/obtenerpersonaporid/{id}") //URL GET
    @ResponseBody
    public Optional<Persona> getPersona(@PathVariable Integer id){
        return personaServi.obtenerPersonaPorId(id);
    }

    @PutMapping("/modificarpersona") // URL PUT
    public ResponseEntity<String> modificarPersona(@RequestBody Persona persona) {
        personaServi.modificarPersona(persona);
        return ResponseEntity.ok("Persona modificada exitosamente");
    }

}
