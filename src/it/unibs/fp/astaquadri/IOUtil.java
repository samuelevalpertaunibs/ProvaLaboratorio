package it.unibs.fp.astaquadri;

import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;
import it.unibs.fp.mylib.NumeriCasuali;

import java.text.Format;

public class IOUtil {
    public static final String MESS_IF_ANNO_PRODUZIONE = "Vuoi aggiungere la data di produzione del quadro?";
    public static final String MESS_ALTRO_BRANO = "Desideri aggiungere un altro quadro?";
    public static final int MAX_ID = 9999999;
    private static final String TITOLO_GESTIONE_QUADRI = "Selezionare l'operazione";
    private static final String[] VOCI_MENU_GESTIONE_QUADRI = {"Visualizza quadri", "Aggiungi un quadro", "Aggiungi un acquirente"};
    public static final String MESS_TITOLO = "Inserisci il titolo del quadro >";
    public static final String MESS_NOME_ARTE_AUTORE = "Inserisci il nome d\'arte dell\'autore >";
    public static final String MESS_NOME_AUTORE = "Inserisci il nome dell\'autore >";
    public static final String MESS_COGNOME_AUTORE = "Inserisci il cognome dell\'autore >";
    public static final String AUTORE_ESISTENTE = "Abbiamo trovato un autore con questo nome d\'arte";
    public static final String ERR_QUADRO_GIA_ESISTENTE = "IL QUADRO ESISTE GIA\'!";
    public static final String MESS_TECNICA = "Inserisci la tecnica >";
    public static final String MESS_LUNGH = "Inserisci la larghezza in mm >";
    public static final String MESS_LARGH = "Inserisci la larghezza in mm >";
    public static final String MESS_PREZZO_ACQUISTO = "Inserisci il prezzo d\'acquisto >";
    public static final String MESS_ANNO_PRODUZIONE = "Inserisci l\'anno di produzione > ";
    public static final String QUADRO_AGGIUNTO = "QUADRO AGGIUNTO CORRETTAMENTE";
    public static final String NOME_ACQUIRENTE = "Inserisci il nome dell\'acquirente >";
    public static final String ID_ACQUIRENTE = "Inserisci l\'id dell\'acquirente (se 0 verra\' estratto casualmente) >";

    public static void gestisciQuadri(Asta miaAsta){
        MyMenu mainMenu = new MyMenu(TITOLO_GESTIONE_QUADRI, VOCI_MENU_GESTIONE_QUADRI);
        boolean finito = false;
        do {
            int scelta = mainMenu.scegli();

            switch (scelta){
                case 1:
                    System.out.println(miaAsta.visualizzaQuadri());
                    break;
                case 2:
                    IOUtil.aggiungiQuadro(miaAsta);
                    break;
                case 3:
                    IOUtil.aggiungiAcquirente(miaAsta);
                case 0:
                    finito = true;
            }
        } while (!finito);
    }

    public static void aggiungiQuadro(Asta miaAsta){

        Quadro quadroDaAggiungere;

        do {

            String titolo = InputDati.leggiStringaNonVuota(MESS_TITOLO);
            String nome_arte_autore = InputDati.leggiStringaNonVuota(MESS_NOME_ARTE_AUTORE);
            Autore autore = miaAsta.getAutore(nome_arte_autore);

            if(autore == null) {
                String nome_autore = InputDati.leggiStringaNonVuota(MESS_NOME_AUTORE);
                String cognome_autore = InputDati.leggiStringaNonVuota(MESS_COGNOME_AUTORE);
                autore = new Autore(nome_autore, cognome_autore, nome_arte_autore);
            }else{
                System.out.println(AUTORE_ESISTENTE);
            }

            String tecnica = InputDati.leggiStringaNonVuota(MESS_TECNICA);
            int lunghezza = InputDati.leggiInteroPositivo(MESS_LUNGH);
            int larghezza = InputDati.leggiInteroPositivo(MESS_LARGH);
            double prezzo_acquisto = InputDati.leggiDoubleConMinimo(MESS_PREZZO_ACQUISTO, 0);
            double base_asta = prezzo_acquisto + (prezzo_acquisto * miaAsta.PERCENTUALE_BASE_ASTA / 100);


            if(InputDati.yesOrNo(MESS_IF_ANNO_PRODUZIONE)){
                String anno_produzione = InputDati.leggiStringaNonVuota(MESS_ANNO_PRODUZIONE);
                quadroDaAggiungere = new Quadro(titolo, autore, tecnica, anno_produzione, larghezza, lunghezza, prezzo_acquisto, base_asta);
            }else{
                quadroDaAggiungere = new Quadro(titolo, autore, tecnica, larghezza, lunghezza, prezzo_acquisto, base_asta);
            }

            if(miaAsta.esisteQuadro(titolo)){
                System.out.println(ERR_QUADRO_GIA_ESISTENTE);
            }else{
                miaAsta.aggiungiQuadro(quadroDaAggiungere);
                System.out.println(QUADRO_AGGIUNTO);
            }

        } while (InputDati.yesOrNo(MESS_ALTRO_BRANO));

    }

    public static void aggiungiAcquirente(Asta miaAsta){
        Acquirente acquirenteToAdd;

        String nome_acquirente = InputDati.leggiStringaNonVuota(NOME_ACQUIRENTE);
        int id = InputDati.leggiInteroPositivo(ID_ACQUIRENTE);
        if (id == 0) {
            do {
                id = NumeriCasuali.estraiIntero(1, MAX_ID);
            } while (!miaAsta.esisteAcquirente(id));
            System.out.println("ID estratto: " + id);
        }
        acquirenteToAdd = new Acquirente(nome_acquirente, id);

        miaAsta.aggiungiAcquirente(acquirenteToAdd);
    }

    public static void avviaSeduta(Asta miaAsta){
        SedutaAsta miaSeduta = new SedutaAsta();
        System.out.println("AVVIO FASE DI VENDITA");
        MyMenu menu_fase_vendita = new MyMenu("Seleziona l'operazione", new String[] {"Seleziona quadro"});
        int scelta_menu = menu_fase_vendita.scegli();
        switch(scelta_menu){
            case 1:
                IOUtil.faseVendita(miaAsta, miaSeduta);
                break;
            case 0:
                System.out.println(miaSeduta.getRegistro());
                System.out.println("CHIUSURA FASE DI VENDITA");
        }
    }

    public static void faseVendita(Asta miaAsta, SedutaAsta miaSeduta){
        System.out.println(miaAsta.visualizzaQuadri());
        int quadro_scelto = InputDati.leggiIntero("Inscerisci il numero del quadro da mettere in vendita > ", 0, miaAsta.getNumeroQuadri() - 1);
        System.out.println("Selezionare l\'operazione");
        System.out.println("1. Aggiungi offerta");
        System.out.println("2. Ritira");
        int scelta = InputDati.leggiIntero("", 1 , 2);
        switch (scelta) {
            case 1:
                IOUtil.avviaOfferte(miaAsta, miaSeduta, quadro_scelto);
                break;
            case 2:
                miaSeduta.aggiungiEvento("QUADRO RITIRATO");
                System.out.println("ABBIAMO RITIRATO IL QUADRO");
                break;
        }
    }

    public static void avviaOfferte(Asta miaAsta, SedutaAsta miaSeduta, int quadro_scelto){
        MyMenu menu = new MyMenu("", new String[] {"Aggiungi offerta", "Offerta precedente aggiudicata"});
        boolean finito = false;
        Offerta ultimaOfferta = new Offerta(0);
        int scelta;
        do{
            scelta = menu.scegliSenzaExit();
            switch(scelta) {
                case 1:
                    int id_acquirente;
                    do {
                        id_acquirente = InputDati.leggiInteroPositivo("Inserisci l\'id dell\'acquirente > ");
                    }while (!miaAsta.esisteAcquirente(id_acquirente));
                    double prezzo = InputDati.leggiDoubleConMinimo("Inserisci il valore dell\'offerta > ", ultimaOfferta.getPrezzo() + 0.01);
                    miaSeduta.aggiungiOfferta(new Offerta(miaAsta.getAcquirente(id_acquirente), miaAsta.getQuadro(quadro_scelto), prezzo));
                    break;
                case 2:
                    if(miaSeduta.getUltimaOfferta().getPrezzo() < miaAsta.getQuadro(quadro_scelto).getBase_asta()){
                        if(InputDati.yesOrNo("Il quadro verra\' venduto a " + miaAsta.getQuadro(quadro_scelto).getBase_asta())){
                            miaSeduta.aggiungiGuadagno(miaAsta.getQuadro(quadro_scelto).getBase_asta() - miaAsta.getQuadro(quadro_scelto).getPrezzo_acquisto());
                            miaAsta.rimuoviQuadro(quadro_scelto);
                            miaSeduta.aggiungiEvento("Il quadro è stato venduto a " + miaAsta.getQuadro(quadro_scelto).getBase_asta());
                        }else{
                            System.out.println("Il quadro non è stato venduto");
                            miaSeduta.aggiungiEvento("Offerta non accettata");
                        }
                    }else{
                        miaSeduta.aggiungiGuadagno(miaSeduta.getUltimaOfferta().getPrezzo() - miaAsta.getQuadro(quadro_scelto).getPrezzo_acquisto());
                        miaAsta.rimuoviQuadro(quadro_scelto);
                        miaSeduta.aggiungiEvento("Il quadro è stato venduto a " + miaSeduta.getUltimaOfferta().getPrezzo());
                    }
                    break;
                default:
                    System.out.println("Operazione non valida");
            }
        } while (scelta != 2);
    }

    public static void inizialize(Asta miaAsta){
        Autore autore1 = new Autore("Paolo", "Paoli", "PP");
        Autore autore2 = new Autore("Luca", "Luci", "LL");
        Autore autore3 = new Autore("Marco", "Marchi", "MM");
        Acquirente acquirente1 = new Acquirente("Andrea", 1);
        Acquirente acquirente2 = new Acquirente("Giorgio", 2);
        Acquirente acquirente3 = new Acquirente("Marco", 3);
        miaAsta.aggiungiAcquirente(acquirente1);
        miaAsta.aggiungiAcquirente(acquirente2);
        miaAsta.aggiungiAcquirente(acquirente3);
        Quadro quadro1 = new Quadro("Quadro1", autore1, "Olio su tela", "2008", 100, 100, 200, 110);
        Quadro quadro2 = new Quadro("Quadro1", autore2, "Pennarelli", "2009", 100, 100, 200, 110);
        Quadro quadro3 = new Quadro("Quadro1", autore3, "Tempere", 100, 100, 200, 110);
        miaAsta.aggiungiQuadro(quadro1);
        miaAsta.aggiungiQuadro(quadro2);
        miaAsta.aggiungiQuadro(quadro3);
    }
}

