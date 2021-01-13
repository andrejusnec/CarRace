package carrace;

public class CarRace {

    public static void main(String[] args) {
        int[] cars = new int[8];
        int[] kilometrai = new int[8];
        int[] bandymas = new int[8];
        int test = 100;
        int riba = 1000;
        for (int i = 0; i < riba; i++) {
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
                if (cars[k] >= 1000) { // kai pasiekia 1000km suraso visus tuo metu
                    //esamus rezultatus i nauja masyva
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
                        System.out.print(kilometrai[j] + " ");
                    }
                    //parasau kas laimejo ( k + 1)pridedu 1 nes indeksai eina nuo 0,
                    //o man reikia car numerio
                    System.out.println("\nLAIMEJO " + (k + 1) + " masina nuvaziavusi "
                            + cars[k] + "km!");
                    return;
                }
                cars[k] += Math.round((int) (Math.random() * 10 + 1));
            }
        }

    }

}
// 8 masynos su 0 rodmenu
