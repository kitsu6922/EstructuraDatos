package pez;

public class Pez {

    public String Tipo_pez;
    public int Por_nacimiento;
    public Pez(String Tipo_pez, int Por_nacimiento){
        this.Tipo_pez=Tipo_pez;
        this.Por_nacimiento=Por_nacimiento;
    }

    public String getTipo_pez(){
        return Tipo_pez;
    }

    public void setTipo_pez(String tipo_pez) {
        Tipo_pez = tipo_pez;
    }

    public int getPor_nacimiento() {
        return Por_nacimiento;
    }

    public void setPor_nacimiento(int por_nacimiento) {
        Por_nacimiento = por_nacimiento;
    }

    public int total_anio(){
        int total=(Por_nacimiento*2)-10;
        return total;
    }
}
