package br.edu.faex.academico;

import br.edu.faex.academico.controller.AlunoController;
import br.edu.faex.academico.model.Aluno;
import br.edu.faex.academico.repository.AlunoRepository;
import br.edu.faex.academico.service.AlunoService;

public class Main {
    public static void main(String[] args)  {
        Aluno aluno1 = new Aluno ("Aleandro Lima", "aleandro.lima@faex.edu.br");
        Aluno aluno2 = new Aluno ("Maria Lima", "maria.lima@faex.edu.br");
        Aluno aluno3 = new Aluno ("Jose Lima", "jose.lima@faex.edu.br");

        AlunoRepository repository = new AlunoRepository();
        AlunoService service = new AlunoService(repository);
        AlunoController controller = new AlunoController(service);
        controller.cadastrar(aluno1);
        controller.cadastrar(aluno2);
        controller.cadastrar(aluno3);

    }
}
