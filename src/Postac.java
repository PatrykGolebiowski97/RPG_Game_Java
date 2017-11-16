public class Postac {
	public double predkoscAtaku;
	public double obrona;
	public double sila;
	public double money;
	public int level;
	public double exp;
	public double zrecznosc;
	public double inteligencja;
	public double witalnosc;

    private static double hp = 100;
    private static double hpMax = 1000;
    private static double mana = 233;
    private static double manaMax = 1000;

    public static double getHp () {return hp;}
    public static double getHpMax () {return hpMax;}
    public static double getMana () {return mana;}
    public static double getManaMax () {return manaMax;}

    public Postac() {}

	public Postac (double predkoscAtaku, double obrona, double sila, double money, int level, double exp) {
        this.predkoscAtaku = predkoscAtaku;
        this.obrona = obrona;
        this.sila = sila;
        this.money = money;
        this.level = level;
        this.exp = exp;
    }

	public void atak (double sila){
		this.sila = sila;
		System.out.println("Zadajesz: " + sila + " obrazen");}
	
	public void obrona (double hp, double obrona){
		this.hp = hp;
		this.obrona = obrona;
		double def = hp + obrona;
		System.out.println("Mozesz przyjac: " + def + " obrazen");}
	
	public void hp (double hp, double obrazenie){
		this.hp = hp - obrazenie;
		System.out.println("Zostalo Ci: " + this.hp + " zycia");}
	
	public void level (double exp) {
        if (exp < 200) {
            this.level = 1;
            System.out.println("Twoj level wynosi 1 ");
        }
        if (exp >= 200 && exp < 300) {
            this.level = 2;
            System.out.println("Twoj level wynosi 2 ");
        }
        if (exp >= 300 && exp < 400) {
            this.level = 3;
            System.out.println("Twoj level wynosi 3 ");
        }
        if (exp >= 400 && exp < 500) {
            this.level = 4;
            System.out.println("Twoj level wynosi 4 ");
        }
        if (exp >= 500 && exp < 600) {
            this.level = 5;
            System.out.println("Twoj level wynosi 5 ");
        }
        if (exp >= 600 && exp < 700) {
            this.level = 6;
            System.out.println("Twoj level wynosi 6 ");
        }
        if (exp >= 700 && exp < 800) {
            this.level = 7;
            System.out.println("Twoj level wynosi 7 ");
        }
        if (exp >= 800 && exp < 900) {
            this.level = 8;
            System.out.println("Twoj level wynosi 8 ");
        }
        if (exp >= 900 && exp < 1000) {
            this.level = 9;
            System.out.println("Twoj level wynosi 9 ");
        }
    }

	public void probna(){
		System.out.println("Dziala");
	}	
	}

