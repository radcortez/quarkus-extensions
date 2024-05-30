package com.radcortez.quarkus.extensions.runtime;

import com.radcortez.quarkus.extensions.library.Saiyan;

public class LibraryHolder {
    private static volatile Saiyan saiyan;

    static void registerLibrary(Saiyan saiyan) {
        LibraryHolder.saiyan = saiyan;
    }

    static Saiyan getLibrary() {
        return saiyan;
    }
}
