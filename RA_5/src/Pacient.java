import java.util.Date;

public class Pacient {
    private String nom;
    private String cognom;
    private Date naixament;
    private String dni;
    private int genere;
    private float alçada; //real=float
    private float pes;
    private String[] allergies;
    private String[] medicacio;
    private String[] malalties;
    private String[] operacions;

    public float imc() {
        return pes/alçada;
    }




}
