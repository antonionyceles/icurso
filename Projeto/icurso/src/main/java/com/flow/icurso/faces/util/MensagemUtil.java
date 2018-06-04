/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flow.icurso.faces.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author antoniony.lima
 */
public class MensagemUtil {

    /**
     * @param msg Mensagem a ser exibida
     * @param titulo Tiulo da mensagem
     * @param tipo Mensagem do Tipo I(INFO), E(ERROR), W(WARN) e F(FATAL)
     *
     * @see FacesMessage
     */
    public static void addMensagem(String msg, String tipo) {
        FacesMessage message = null;
        switch (tipo) {

            case "I":
                message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Informação", msg);
                break;
            case "E":
                message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", msg);
                break;
            case "W":
                message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Atenção", msg);
                break;
            case "F":
                message = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Erro Fatal", msg);
                break;

        }
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
