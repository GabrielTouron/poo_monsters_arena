public class Arena {

    public static void main(String[] args) {
        //Set monster name and life points here
        Monster blueCorner = new Monster("Dragon",150);
        Monster redCorner = new Monster("Minotor",80);

        while (true) {
            //Set monsters damage here
            blueCorner.attack(15, redCorner);
            redCorner.attack(11, blueCorner);
            //Equality
            if ((blueCorner.life == 0 || blueCorner.life < 0) && (redCorner.life == 0 || redCorner.life < 0)) {
                System.out.printf("Monsters are KO ! this arena is full of blood");
                break;
            }
            //RedCorner is the winner
            if (blueCorner.life == 0 || blueCorner.life < 0 ) {
                System.out.printf("%s is the winner !", redCorner.name);
                break;
            }
            //RueCorner is the winner
            if (redCorner.life == 0 || redCorner.life < 0) {
                System.out.printf("%s is the winner !", blueCorner.name);
                break;
            }

        }
    }
}
