package conversiones;

public class Main {
    public static void main(String[] args) {
        Conversion conversion=new Conversion();
        String res=conversion.binario(2);
        System.out.println(res);
        res=conversion.hex(8);
        System.out.println(res);
    }
}
