package com.radcortez.quarkus.extensions.deployment;

import com.radcortez.quarkus.extensions.library.Library;

import io.quarkus.builder.item.SimpleBuildItem;

public final class LibraryBuildItem extends SimpleBuildItem {
    private final Library library;

    public LibraryBuildItem(final Library library) {
        this.library = library;
    }

    public Library getLibrary() {
        return library;
    }
}
