package brunojiac1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/atletas")
public class OlimpiadasController {

    private List<Atleta> atletas = new ArrayList<>();
    private List<Atleta> convocados = new ArrayList<>();

    @PostMapping("/adicionar/escalador")
    public void adicionarEscalador(@RequestBody Escalador e){
        atletas.add(e);
    }

    @GetMapping("/inscritos")
    public List<Atleta> getAtletas(){
        return atletas;
    }

    @GetMapping("/consultar/{id}")
    public Atleta getAtleta(@PathVariable int id){
        return atletas.get(id - 1);
    }

    @GetMapping("/convocados")
    public List<Atleta> getConvocados(){
        for(Atleta a: atletas){
            if(a.calcPontosTotais() <= 10){
                convocados.add(a);
            }
        }
        return convocados;
    }

    @DeleteMapping("/deletar/{id}")
    public void deleteAtleta(@PathVariable Atleta id){
        atletas.remove(id);
    }
}
