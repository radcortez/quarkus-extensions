package com.radcortez.quarkus.extensions.library;

import java.util.concurrent.TimeUnit;

public class SaiyanTransform {
    public Saiyan superSaiyan() {
        System.out.println("Transforming to Super Saiyan");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("I'm finally done!");
        return new Saiyan();
    }
}
