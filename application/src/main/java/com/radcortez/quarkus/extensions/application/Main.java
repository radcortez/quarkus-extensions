package com.radcortez.quarkus.extensions.application;

import com.radcortez.quarkus.extensions.library.Saiyan;
import com.radcortez.quarkus.extensions.library.SaiyanTransform;

public class Main {
    public static void main(String[] args) {
        Saiyan saiyan = new SaiyanTransform().superSaiyan();
        System.out.println(saiyan.kamehameha());
    }
}
