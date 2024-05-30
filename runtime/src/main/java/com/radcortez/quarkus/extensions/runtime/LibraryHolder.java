package com.radcortez.quarkus.extensions.runtime;

import com.radcortez.quarkus.extensions.library.Library;

public class LibraryHolder {
    private static volatile Library library;

    static void registerLibrary(Library library) {
        LibraryHolder.library = library;
    }

    static Library getLibrary() {
        return library;
    }
}
