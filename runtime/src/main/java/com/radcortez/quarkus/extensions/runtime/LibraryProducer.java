package com.radcortez.quarkus.extensions.runtime;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

import com.radcortez.quarkus.extensions.library.Library;

@ApplicationScoped
public class LibraryProducer {
    @Produces
    public Library library() {
        return LibraryHolder.getLibrary();
    }
}
