package com.radcortez.quarkus.extensions.runtime;

import com.radcortez.quarkus.extensions.library.Library;

import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class LibraryRecorder {
    public void registerLibrary(final Library library) {
        LibraryHolder.registerLibrary(library);
    }
}
