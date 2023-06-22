package it.unibs.fp.astaquadri;

import it.unibs.fp.mylib.MyMenu;

public class Main {

    private final static String BENVENUTO = "BENVENUTO NEL GESTORE D'ASTA";
    private static final String[] VOCI_MENU = {"Gestisci quadri", "Avvia una nuova seduta d'asta"};
    private static final String TITOLO_GESTORE = "Selezionare l'operazione";
    public static void main(String[] args) {

        Asta miaAsta = new Asta();
        IOUtil.inizialize(miaAsta);
        System.out.println(BENVENUTO);
        MyMenu mainMenu = new MyMenu(TITOLO_GESTORE,VOCI_MENU);
        boolean finito = false;
        int scelta;
        do {
            scelta = mainMenu.scegli();

            switch (scelta){
                case 1:
                    IOUtil.gestisciQuadri(miaAsta);
                    break;
                case 2:
                    IOUtil.avviaSeduta(miaAsta);
                    break;
                case 0:
                    finito = true;
            }
        } while (!finito);
    }
}
