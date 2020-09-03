package com.brunojiavaliacaocontinuada1.ac1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/escaladores")
public class AbeeCtrl {
    // obs: ABEE = Associação Brasileira de Escalada Esportiva
    List<Escalador> escaladores = new ArrayList<>();
//    List<Escalador> escaladores = Arrays.asList(
//            new EscaladorBoulder("Bruno", 7.5, 5.5, 6.5 ),
//            new EscaladorGuiado("Chang", 8.0, 7.5, 4.5, 9.0),
//            new EscaladorVelocidade("Hwan", 8.0, 9.0),
//            new EscaladorBoulder("Ji", 8.0, 7.5, 9.0)
//    );

    @GetMapping
    public List<Escalador> getEscaladores(){
        return escaladores;
    }

    @GetMapping("/{id}")
    public Escalador getEscalador(@PathVariable int id){
        return escaladores.get(id - 1);
    }

    @PostMapping("/EscaladorBoulder")
    public void cadastrarBoulder(@RequestBody EscaladorBoulder escaladorBoulder){
        escaladores.add(escaladorBoulder);
    }

    @PostMapping("/EscaladorGuiado")
    public void cadastrarGuiado(@RequestBody EscaladorGuiado escaladorGuiado){
        escaladores.add(escaladorGuiado);
    }

    @PostMapping("/EscaladorVelocidade")
    public void cadastrarVelocidade(@RequestBody EscaladorVelocidade escaladorVelocidade){
        escaladores.add(escaladorVelocidade);
    }

    @DeleteMapping("/{id}")
    public void deleteEscalador(@PathVariable int id){
        escaladores.remove(id - 1);
    }

    @GetMapping("/convocados")
    public List getConvocados(){
        return escaladores.stream()
                .filter(escalador -> escalador.calcPontos() >= 7.0)
                .collect(Collectors.toList());
    }
}
