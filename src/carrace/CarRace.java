package carrace;

public class CarRace {

    public static void main(String[] args) {
        Cars[] cars = {
            new Cars("Pirma", 140),
            new Cars("Antra", 160),
            new Cars("Trecia", 170),
            new Cars("Ketvirta", 200),
            new SportCar("PenktaSport", 300),
            new SportCar("SestaSport", 280),
            new SportCar("SeptyntaSport", 320),
            new SportCar("AstuntaSport", 310)
        };
        int test = 100;
        int riba = 1000;
        for (int i = 0; i <= riba;) {
            //bendro nuvazioto kelio ciklas
            for (int k = 0; k < cars.length; k++) {
                if (test != riba) { // if'as skirtas patikrinti ar testas nepriejo
                    //ribos(kad nespausdintu paskutikio kas pirmauja
                    if (cars[k].nuvaziavoKm >= test) {//spausdina kas pirmauja
                        System.out.println("Pirmauja " + (k + 1) + " masina!");
                        System.out.println(cars[k].nuvaziavoKm + "km");
                        test += 100;
                    }
                }
                /**
                 * ************************************************************/
                if(cars[k] instanceof SportCar) {
                    //SportCar tipo matymas ir patikrinimas
                     ((SportCar) cars[k]).arPakeltas();
                 }
                cars[k].vaziok();

                /**
                 * ****************************************************************
                 */
                //uzraso maksimalu praeita kieki per rata, kai kazkuri masina
                //pravazioja virs 1000, ciklas nutruksta
                if (i < cars[k].nuvaziavoKm) {
                    i = cars[k].nuvaziavoKm;
                }
                //System.out.println("*********" + cars[k].nuvaziavoKm + "************");
            }
        }
        System.out.println("**********************");
        //masyvo surusiavimas didejimo tvarka
        for (int j = 0; j < cars.length; j++) {
            for (int x = j + 1; x < cars.length; x++) {
                Cars temporary = new Cars();
                if (cars[j].nuvaziavoKm < cars[x].nuvaziavoKm) {
                    temporary = cars[j];
                    cars[j] = cars[x];
                    cars[x] = temporary;
                }
            }
        }

        System.out.println("");
        //parasau kas laimejo ir pridedu 1 nes indeksai eina nuo 0,
        //o man reikia car numerio
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i+1) +" Vieta uzeme masina: " + cars[i].pav
                    + " nuvaziavusi " + cars[i].getNuvaziavoKm());
        }

    }
}
