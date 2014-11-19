package model;

import model.Mexame;
import model.Mmedico;
import model.Mpaciente;

/**
 *
 * @author Administrador
 */
public class Mexame_paciente {
    private Mmedico medico;
    private Mpaciente paciente;
    private Mexame exame;
    private String dtexame;
    private int qtdexame;
    private Double valorexame;

    /**
     * @return the medico
     */
    public Mmedico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Mmedico medico) {
        this.medico = medico;
    }

    /**
     * @return the paciente
     */
    public Mpaciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Mpaciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the exame
     */
    public Mexame getExame() {
        return exame;
    }

    /**
     * @param exame the exame to set
     */
    public void setExame(Mexame exame) {
        this.exame = exame;
    }

    /**
     * @return the dtexame
     */
    public String getDtexame() {
        return dtexame;
    }

    /**
     * @param dtexame the dtexame to set
     */
    public void setDtexame(String dtexame) {
        this.dtexame = dtexame;
    }

    /**
     * @return the qtdexame
     */
    public int getQtdexame() {
        return qtdexame;
    }

    /**
     * @param qtdexame the qtdexame to set
     */
    public void setQtdexame(int qtdexame) {
        this.qtdexame = qtdexame;
    }

    /**
     * @return the valorexame
     */
    public Double getValorexame() {
        return valorexame;
    }

    /**
     * @param valorexame the valorexame to set
     */
    public void setValorexame(Double valorexame) {
        this.valorexame = valorexame;
    }
    
}
