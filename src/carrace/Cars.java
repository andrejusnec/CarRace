package carrace;

public class Cars {

    public String pav;
    public int nuvaziavoKm;
    public int maxGreitis;
    public int greitis;
/********************CONSTRUCTOR******************/
    public Cars() {     //konstruktorius kintamajam
        this.pav = "";
        this.maxGreitis = 0;
        this.nuvaziavoKm = 0;
        this.greitis = 0;
    }
    public Cars(String name, int maxGreitis) { 
        this.pav = name;
        this.maxGreitis = maxGreitis;
        this.nuvaziavoKm = 0;
        this.greitis = 0;
    }

    public void gazuok() {
        // if(Spoileris) nuleistas - gazuoja 2x greiciau
        this.greitis += Math.round((int) (Math.random() * 10 + 1));
        if(this.greitis > this.maxGreitis) {
            this.greitis = this.maxGreitis;
        }
        
    }

    public void stabdyk() {
        //jei sportine masina 50%  kad pasikeis spoilerio pozicija
        // jei spoileris pakeltas - stabdo 2x greiciau
        if(this.greitis > this.maxGreitis) {
            this.greitis = this.maxGreitis;
        }
        this.greitis -= Math.round((int) (Math.random() * 5 + 1));
        if(this.greitis < 0) {
            this.greitis = 0;
        }
        
    }
    /*****************Get/Set********************/
    public void setGreitis(int speed) {
        this.greitis = speed;
    }
    public int getGreitis() {
        return this.greitis;
    }
    public int getNuvaziavoKm() {
        return this.nuvaziavoKm;
    }
    /*************************************************/
    public void vaziok() {
        double random = Math.random();     // 10
        if (random >= 0 && random < 0.5) {
            gazuok();
        }
        if (random >= 0.5 && random < 0.8) {
            stabdyk();
        }
        this.nuvaziavoKm += this.greitis;
                // 30% tikimybe kad masina stabdys 1-5
                // 50% kad gazuok 1-10
                // 20% kad nekeis greicio 
               
    }
}
