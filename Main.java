package holydayzer;

public class Main {
    public static void main(String[] args) {
        String feriado = new Holidays().getHoliday("12/01/2023");
        if(feriado != null) {
            System.out.println("Hoje eh feriado de: " + feriado);
        } else {
            System.out.println("Hoje nao eh feriado!");
        }
    }
}
