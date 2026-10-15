import org.example.Auto;
import org.example.Moto;

import static java.lang.IO.println;

void main() {
    Auto auto1 = new Auto("GW017LV", 2024, 5);
    Moto moto1 = new Moto("EZ71378", 2013, 1000);
    println("Auto: " + auto1.Descrizione() + "\nMoto: " + moto1.Descrizione() + "\n");
}
