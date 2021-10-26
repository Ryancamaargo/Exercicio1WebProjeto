package br.edu.utfpr.webExercicio1.testes;

import br.edu.utfpr.webExercicio1.model.*;
import org.junit.Assert;
import org.junit.Test;

public class TestesUnitariosTotal {
    @Test
    public void testePaciente(){
        Paciente paciente = new Paciente();
        paciente.setId(1L);
        paciente.setNome("Ryann");
        paciente.setIdade(19);

        Assert.assertEquals("Ryann", paciente.getNome());
        //Assert.assertEquals("Ryan2", paciente.getNome()); -> esse teste, se tirar o comentario, vai falhar, pois não existe o paciente Ryan2.
    }
    @Test
    public void testeDoenca(){
        Doenca doenca = new Doenca();
        doenca.setId(1L);
        doenca.setNome("Gripe");

        Assert.assertEquals("Gripe", doenca.getNome());
        //Assert.assertEquals("Dor de dente", paciente.getNome()); -> esse teste, se tirar o comentario, vai falhar, pois não existe a doenca Dor de dente.
    }
    @Test
    public void testeCuidadosMinimos(){
        Doenca doenca = new Doenca();
        doenca.setId(1L);
        doenca.setNome("Gripe");

        CuidadosMinimos cuidados = new CuidadosMinimos();
        cuidados.setId(1L);
        cuidados.setDoenca(doenca);
        cuidados.setDescricao("Não ouvir musica alto e dormir bem");

        Assert.assertEquals("Não ouvir musica alto e dormir bem", cuidados.getDescricao());
        Assert.assertEquals(1, cuidados.getId().intValue());
        //Assert.assertEquals(3, cuidados.getId().intValue()); se tirar o comentario, ele vai dar teste com falha... pois nao edxiste o id 3.

    }
    @Test
    public void testeMedicamento(){
        Doenca doenca = new Doenca();
        doenca.setId(1L);
        doenca.setNome("Gripe");

        Medicamento medicamento = new Medicamento();
        medicamento.setId(1L);
        medicamento.setDoenca(doenca);
        medicamento.setNome("Dorflex");

        Assert.assertEquals("Dorflex", medicamento.getNome());
        Assert.assertEquals("Gripe", medicamento.getDoenca().getNome());
    }

    @Test
    public void registrarReceituario(){
        Paciente paciente = new Paciente();
        paciente.setId(1L);
        paciente.setNome("Ryann");
        paciente.setIdade(19);

        Doenca doenca = new Doenca();
        doenca.setId(1L);
        doenca.setNome("Dor de cabeça");

        CuidadosMinimos cuidados = new CuidadosMinimos();
        cuidados.setId(1L);
        cuidados.setDoenca(doenca);
        cuidados.setDescricao("Não ouvir musica alto e dormir bem");

        Medicamento medicamento = new Medicamento();
        medicamento.setId(1L);
        medicamento.setDoenca(doenca);
        medicamento.setNome("Dorflex");

        Receituario receituario = new Receituario();
        receituario.setId(1L);
        receituario.setObservacao("Repousar bastante e tomar remédio de 8 em 8 horas");
        receituario.setDoenca(doenca);
        receituario.setPaciente(paciente);

        //testes isolados, sem integração...
        Assert.assertEquals("Ryann", paciente.getNome());
        Assert.assertEquals("Dor de cabeça", doenca.getNome());
        Assert.assertEquals(1, cuidados.getId().intValue());
        Assert.assertEquals("Dorflex", medicamento.getNome());

        //O TESTE debaixo, se descomentar, vai dar teste failed... por conta que não existe esse medicamento com o nome 1. Mas com o Dorflex (acima ali) sim...
        //Assert.assertEquals("1", medicamento.getNome());

        //teste no receituario, envolvendo mais classes
        Assert.assertEquals("Repousar bastante e tomar remédio de 8 em 8 horas", receituario.getObservacao());
        Assert.assertEquals("Dor de cabeça", receituario.getDoenca().getNome());
        Assert.assertEquals("Ryann", receituario.getPaciente().getNome());
    }
}
