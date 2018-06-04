/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flow.icurso.managedbean;

import com.flow.icurso.entity.Conteudo;
import com.flow.icurso.entity.Curso;
import com.flow.icurso.faces.util.MensagemUtil;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author antoniony.lima
 */
@Named(value = "cursoMB")
@Dependent
@ManagedBean
@ViewScoped
public class CursoMB {

    Curso curso;

    /**
     * Creates a new instance of CursoMB
     */
    public CursoMB() {

    }

    @PostConstruct
    public void init() {
        curso = new Curso();
        curso.setArea("Anatomia");
        curso.setDescricao("Esse é um curso para teste");
        curso.setNome("Curso TESTE");
        curso.setConteudo(new ArrayList<Conteudo>());
        curso.getConteudo().add(new Conteudo("Modulo 1", "TESTE", Long.parseLong("10")));
        curso.getConteudo().add(new Conteudo("Modulo 2", "TESTE", Long.parseLong("10")));
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
    public void salvar(){
        MensagemUtil.addMensagem("Curso Salvo com sucesso!", "I");
    }

}
