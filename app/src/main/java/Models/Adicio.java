package Models;

public class Adicio {


    private String [] adicio= {"Tocino","Extra Queso","Champiñon","Salame","Albahaca"};
    private int [] adicionam={350,500,250,300,450};


    public Adicio()
    {


    }

    public Adicio(String[] adicio, int[] adicionam) {
        this.adicio = adicio;
        this.adicionam = adicionam;
    }

    public String[] getAdicio() {
        return adicio;
    }

    public void setAdicio(String[] adicio) {
        this.adicio = adicio;
    }

    public int[] getAdicionam() {
        return adicionam;
    }

    public void setAdicionam(int[] adicionam) {
        this.adicionam = adicionam;
    }
}
