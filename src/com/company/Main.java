package com.company;

public class Main {
/*
Weil dir Programmieren so viel Spaß macht, verlierst du dich am Weg in die Arbeit in den neuesten Posts auf
https://www.reddit.com/r/ProgrammerHumor/. In der letzten Woche hast du bereits drei Mal die Haltestelle versäumt
und musstest zu Fuß zurückgehen. Also setzt du dich zu Hause hin und schreibst eine App, welche dir live anzeigt,
wie lange es noch bis zu deiner Station ist. Nur woher soll diese wissen was sie anzuzeigen hat?
a.)	(leicht) Schreibe eine Methode welche abhängig von der Station die Dauer zum Ziel ausgibt:
Bei Station 1 sind es noch 20 Minuten
Bei Station 2 sind es noch 16 Minuten
Bei Station 3 sind es noch 15 Minuten
Bei Station 4 bleiben noch 10 Minuten über
Bei Station 5 sind es dann nur noch 3 Minuten
b.)	(leicht) Station 6 ist dein Ziel, hier soll eine Warnmeldung ausgegeben werden, damit du auch ja nicht vergisst auszusteigen!

 */

    public static void main(String[] args) {

        System.out.println("Du fährst noch " + wielangenoch (6) + " Minuten." );


    }
    public static int wielangenoch (int station) {
        int minuten = 0;
        switch (station) {
            case 1 :
                minuten = 20;
                break;
            case 2 :
                minuten = 16;
                break;
            case 3:
                minuten = 15;
                break;
            case 4:
                minuten = 10;
                break;
            case 5:
                minuten = 3;
                break;
            case 6:
                System.out.println("Achtung: Aussteigen!");
        }
        return minuten;
    }
}
