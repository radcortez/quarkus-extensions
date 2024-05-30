package com.radcortez.quarkus.extensions.deployment;

import com.radcortez.quarkus.extensions.library.Saiyan;

import io.quarkus.builder.item.SimpleBuildItem;

public final class LibraryBuildItem extends SimpleBuildItem {
    private final Saiyan saiyan;

    public LibraryBuildItem(final Saiyan saiyan) {
        this.saiyan = saiyan;
    }

    public Saiyan getLibrary() {
        return saiyan;
    }
}
