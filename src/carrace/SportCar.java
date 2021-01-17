package carrace;

public class SportCar extends Cars {

    private boolean Spoileris;

    public SportCar(String pav, int maxGreitis) {
        super(pav, maxGreitis);
        this.Spoileris = false;
    }

    public void arPakeltas() {
        double random = Math.random();
        if (random >= 0 && random < 0.5) {
            this.Spoileris = true;
        }
    }

    @Override
    public void stabdyk() {
        if (getGreitis() > this.maxGreitis) {
            this.greitis = this.maxGreitis;
        }
        if (this.Spoileris) {
            this.greitis -= Math.round((int) ((Math.random() * 5 + 1) / 2));
        } else {
            this.greitis -= Math.round((int) (Math.random() * 5 + 1));
        }
        if (this.greitis < 0) {
            this.greitis = 0;
        }
    }

    @Override
    public void gazuok() {
        // if(Spoileris) nuleistas - gazuoja 2x greiciau
        if (this.Spoileris) {
            this.greitis += Math.round((int) (Math.random() * 10 + 1));
        } else {
            this.greitis += Math.round((int) ((Math.random() * 10 + 1) * 2));
        }
        if (this.greitis > this.maxGreitis) {
            this.greitis = this.maxGreitis;
        }

    }

    //spoileris pakeltas - true
    //spoileris nuleistas - false
    //pries tai kai nuspresti ar masina stabdys ar gazuos - reikia
    //patikrinti ar tai yra sportine masina
    //jei sportine masina 50% tikimibe kad pasikeis spoilerio pozicija
    // jeigu  gazuok spoileris nuleistas  - gazuoja 2x greiciau
    // jeigu stabdyk jei pakeltas spoileris - stabdo 2x greiciau
}
