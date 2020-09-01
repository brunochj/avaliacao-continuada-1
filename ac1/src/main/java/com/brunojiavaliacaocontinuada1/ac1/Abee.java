package com.brunojiavaliacaocontinuada1.ac1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/escaladores")
public class Abee {
    // obs: ABEE = Associação Brasileira de Escalada Esportiva
    List<Escalador> escaladores = new ArrayList<>();
//    List<Escalador> escaladores = Arrays.asList(
//            new EscaladorBoulder("Bruno", 7.5, 5.5, 6.5 ),
//            new EscaladorGuiado("Chang", 8.0, 7.5, 4.5, 9.0),
//            new EscaladorVelocidade("Hwan", 8.0, 9.0),
//            new EscaladorBoulder("Ji", 8.0, 7.5, 9.0)
//    );

    @GetMapping("/listar")
    public List<Escalador> getEscaladores(){
        return escaladores;
    }

    @PostMapping("/cadastrar/EscaladorBoulder")
    public void cadastrar(@RequestBody EscaladorBoulder escaladorBoulder){
        escaladores.add(escaladorBoulder);
    }

    @GetMapping("/recuperar/{id}")
    public Escalador getEscalador(@PathVariable int id){
        return escaladores.get(id - 1);
    }

    @DeleteMapping("/deletar/{id}")
    public void deleteEscalador(@PathVariable int id){
        escaladores.remove(id - 1);
    }
}