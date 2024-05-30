package com.radcortez.quarkus.extensions.deployment;

import jakarta.inject.Inject;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import com.radcortez.quarkus.extensions.library.Saiyan;

import io.quarkus.test.QuarkusUnitTest;

class SaiyanTest {
    @RegisterExtension
    static QuarkusUnitTest TEST = new QuarkusUnitTest()
            .withConfigurationResource("application.properties")
            .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class));

    @Inject
    Saiyan saiyan;

    @Test
    void library() {
        System.out.println(saiyan.kamehameha());
    }
}
