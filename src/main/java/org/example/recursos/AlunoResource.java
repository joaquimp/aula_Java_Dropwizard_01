package org.example.recursos;

import org.example.entidades.Aluno;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/alunos")
@Produces(MediaType.APPLICATION_XML)
public class AlunoResource {

    private List<Aluno> bancoDados;

    public AlunoResource() {
        bancoDados = new ArrayList();
        bancoDados.add(new Aluno(123, "Joaquim", "Ciência da Computação"));
        bancoDados.add(new Aluno(321, "Célia", "Gastronomia"));
        bancoDados.add(new Aluno(198, "Paulo", "Ciência da Computação"));
        bancoDados.add(new Aluno(891, "Camila", "Biomedicina"));
    }

    @GET
    public List<Aluno> getAlunos() {
        return this.bancoDados;
    }

    @POST
    public Aluno createAluno(Aluno aluno) {

        if(aluno == null) {
            throw new BadRequestException("Amigo, você precisa informar os dados do aluno");
        }

        if(aluno.getNome() == null || aluno.getCurso() == null) {
            throw new BadRequestException("Nome e curso devem ser informados");
        }

        for(Aluno a: bancoDados) {
            if (a.getTia() == aluno.getTia()) {
                throw new BadRequestException("Já existe um aluno com este TIA");
            }
        }

        this.bancoDados.add(aluno);
        return aluno;
    }
}
