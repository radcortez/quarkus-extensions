package com.radcortez.quarkus.extensions.runtime;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

import com.radcortez.quarkus.extensions.library.Saiyan;

@ApplicationScoped
public class LibraryProducer {
    @Produces
    public Saiyan library() {
        return LibraryHolder.getLibrary();
    }
}
