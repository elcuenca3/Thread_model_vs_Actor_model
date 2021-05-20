package Actormodel.caso2;

import Actormodel.caso2.actores.Espadachin;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        akka.Main.main(new String[]{Espadachin.class.getName()});
    }
}