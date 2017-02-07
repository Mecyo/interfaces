/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import interfaces.ICarro;
import interfaces.IGaragem;
import interfaces.IRoda;
import interfaces.ISom;
import interfaces.ITeto;

/**
 *
 * @author Emerson
 */
public class Carro implements ICarro{
    private ISom som;
    private IRoda roda;
    private ITeto teto;

    public Carro(ISom som, IRoda roda, ITeto teto) {
        this.som = som;
        this.roda = roda;
        this.teto = teto;
    }

    @Override
    public String estacionar(IGaragem garagem) {
        return garagem.estacionar(this);
    }

    public String tocar() {
        return this.som.tocar();
    }

    public String abrir() {
        return this.teto.abrir();
    }

    public String alinhar() {
        return this.roda.alinhar();
    }
    
    @Override
    public String toString() {
        return this.roda.getClass().getSimpleName().split("Roda")[1];
    }
}
