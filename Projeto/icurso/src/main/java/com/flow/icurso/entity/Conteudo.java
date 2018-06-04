/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flow.icurso.entity;

/**
 *
 * @author antoniony.lima
 */
public class Conteudo {
    
    private String modulo;
    private String disciplina;
    private Long cargaHoraria;

    public Conteudo(String modulo, String disciplina, Long cargaHoraria) {
        this.modulo = modulo;
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }

    
    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Long getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Long cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    
    
}
