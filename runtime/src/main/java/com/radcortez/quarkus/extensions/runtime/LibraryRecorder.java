package com.radcortez.quarkus.extensions.runtime;

import com.radcortez.quarkus.extensions.library.Saiyan;

import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class LibraryRecorder {
    public void registerLibrary(final Saiyan saiyan) {
        LibraryHolder.registerLibrary(saiyan);
    }
}
