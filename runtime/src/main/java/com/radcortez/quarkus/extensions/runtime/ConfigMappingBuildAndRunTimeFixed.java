package com.radcortez.quarkus.extensions.runtime;

import java.util.List;
import java.util.Optional;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;
import io.smallrye.config.WithParentName;

@ConfigMapping(prefix = "quarkus.test")
@ConfigRoot(phase = ConfigPhase.BUILD_AND_RUN_TIME_FIXED)
public interface ConfigMappingBuildAndRunTimeFixed {

    /**
     * Test config
     */
    @WithParentName
    Embeded embeded();

    public interface Embeded {

        /**
         * Test config
         */
        @WithDefault(value = "none")
        String simple();

        /**
         * Test config
         */
        Optional<List<String>> interceptors();
    }
}
