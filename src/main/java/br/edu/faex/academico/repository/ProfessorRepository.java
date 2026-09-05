package br.edu.faex.academico.repository;

import br.edu.faex.academico.model.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorRepository {
    private List<Professor> professores = new ArrayList<>();

    public void salvar(Professor professor){
        professores.add(professor); // Corrigido: adiciona na lista
    }

    public List<Professor> listar(){
        return professores;
    }

    public Professor buscarPorId (Long id){
        for(Professor prof : professores){ // Corrigido: renomeado para evitar conflito com a lista
            if(prof.getId() != null && prof.getId().equals(id)){ // Corrigido: valida null antes do .equals()
                return prof;
            }
        }
        return null;
    }
}