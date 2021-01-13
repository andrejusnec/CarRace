package carrace;

public class CarRace {

    public static void main(String[] args) {
        int[] cars = new int[8];
        int[] kilometrai = new int[8];
        int[] bandymas = new int[8];
        int test = 100;
        int riba = 1000;
        for (int i = 0; i < riba;) {
            //bendro nuvazioto kelio ciklas
            for (int k = 0; k < cars.length; k++) {
                if (test != riba) { // if'as skirtas patikrinti ar testas nepriejo
                    //ribos(kad nespausdintu paskutikio kas pirmauja
                    if (cars[k] >= test) {//spausdina kas pirmauja
                        System.out.println("Pirmauja " + (k + 1) + " masina!");
                        System.out.println(cars[k] + "km");
                        test += 100;
                    }
                }
                /*if (cars[k] >= riba) { // kai pasiekia 1000km suraso visus tuo metu
                    //esamus rezultatus i nauja masyva
                    
                }*/
                cars[k] += Math.round((int) (Math.random() * 10 + 1));
                //uzraso maksimalu praeita kieki per rata, kai kazkuri masina
                //pravazioja virs 1000, ciklas nutruksta
                if (i < cars[k]) {
                    i = cars[k];
                }
            }
        }
        for (int x = 0; x < cars.length; x++) {
            kilometrai[x] = cars[x];
        }
        //masyvo surusiavimas didejimo tvarka
        for (int j = 0; j < kilometrai.length; j++) {
            for (int x = j + 1; x < kilometrai.length; x++) {
                int temporary = 0;
                if (kilometrai[j] < kilometrai[x]) {
                    temporary = kilometrai[j];
                    kilometrai[j] = kilometrai[x];
                    kilometrai[x] = temporary;
                }
            }
            // System.out.print(kilometrai[j] + " ");
        }
        System.out.println("");
        //parasau kas laimejo ir pridedu 1 nes indeksai eina nuo 0,
        //o man reikia car numerio
        String carStr;
        //Sukuriu stringa kad ten usrasyti reiksmes, kuri masina kiek pravaziavo
        for (int i = 0; i < kilometrai.length; i++) {
            carStr = "";
            for (int j = 0; j < cars.length; j++) {
                if (kilometrai[i] == cars[j]) {
                    carStr += (j + 1) + " masina su " + cars[j] + " km.";
                }
            }
            System.out.println((i + 1) + " Vieta uzeme " + ": " + carStr);
        }
    }

}
