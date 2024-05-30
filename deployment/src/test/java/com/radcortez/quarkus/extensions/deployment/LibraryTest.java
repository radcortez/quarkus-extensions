package com.radcortez.quarkus.extensions.deployment;

import jakarta.inject.Inject;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import com.radcortez.quarkus.extensions.library.Library;

import io.quarkus.test.QuarkusUnitTest;

class LibraryTest {
    @RegisterExtension
    static QuarkusUnitTest TEST = new QuarkusUnitTest()
            .withConfigurationResource("application.properties")
            .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class));

    @Inject
    Library library;

    @Test
    void library() {
        System.out.println(library.sayHello("Naruto"));
    }

}
