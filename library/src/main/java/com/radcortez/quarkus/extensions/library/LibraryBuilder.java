package com.radcortez.quarkus.extensions.library;

import java.util.concurrent.TimeUnit;

public class LibraryBuilder {
    public Library build() {
        System.out.println("Creating Library");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Library Created");
        return new Library();
    }
}
