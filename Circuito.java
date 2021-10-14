package ohm;

public class Circuito {

    private float resistencia;
    private float corriente;
    private float voltaje;

    public Circuito(float resistencia, float corriente, float voltaje) {
        this.resistencia = resistencia;
        this.corriente = corriente;
        this.voltaje = voltaje;
    }

    public float CalculoResistencia(float voltaje, float corriente) {
        float valR = voltaje / corriente;
        return valR;
    }

    public float calculoCorriente(float resistencia, float voltaje) {
        float valI = voltaje / resistencia;
        return valI;
    }

    public float calculoVoltaje(float corriente, float resistencia) {
        float valV = corriente * resistencia;
        return valV;
    }

    public float getResistencia() {
        return resistencia;
    }

    public float getCorriente() {
        return corriente;
    }

    public float getVoltaje() {
        return voltaje;
    }

    public void setResistencia(float resistencia) {
        this.resistencia = resistencia;
    }

    public void setCorriente(float corriente) {
        this.corriente = corriente;
    }

    public void setVoltaje(float voltaje) {
        this.voltaje = voltaje;
    }

    public String valorResistencia() {
        return resistencia + " OHM";
    }

    public String valorVoltaje() {
        return voltaje + " V";
    }

    public String valorCorriente() {
        return corriente + " A";
    }

}
