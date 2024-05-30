package com.radcortez.quarkus.extensions.runtime;

import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class TestRecorder {

    public void configure(final ConfigMappingBuildAndRunTimeFixed buildAndRunTimeFixed) {
        System.out.println("TestRecorder.configure");
    }
}
