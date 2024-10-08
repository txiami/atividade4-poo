package animais;

import classesAbstratas.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {
    public Peixe(int idade, String nome, String tipo, String habitat, double peso, double altura) {
        super(idade, nome, tipo, habitat, peso, altura);
    }

    @Override
    public void comer(int comidaIngerida) {
        this.comidaIngerida += comidaIngerida;
        System.out.println("O peixe comeu " + comidaIngerida + " gramas de comida");
    }

    @Override
    public void moverse(int distanciaPercorrida) {
        nadar(distanciaPercorrida);
    }

    @Override
    public void dormir(int horasDormidas) {
        this.horasDormidas += horasDormidas;
        System.out.println("O peixe dormiu " + horasDormidas + " horas");
    }

    @Override
    public void nadar(int distanciaPercorrida) {
        this.distanciaPercorrida += distanciaPercorrida;
        System.out.println("O peixe nadou " + distanciaPercorrida + " metros");
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "tipo='" + tipo + '\'' +
                ", habitat='" + habitat + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", comidaIngerida=" + comidaIngerida +
                ", distanciaPercorrida=" + distanciaPercorrida +
                ", horasDormidas=" + horasDormidas +
                '}';
    }
}
