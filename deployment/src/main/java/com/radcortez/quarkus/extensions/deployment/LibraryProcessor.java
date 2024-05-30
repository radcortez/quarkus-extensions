package com.radcortez.quarkus.extensions.deployment;

import com.radcortez.quarkus.extensions.library.SaiyanTransform;
import com.radcortez.quarkus.extensions.runtime.ConfigMappingBuildAndRunTimeFixed;
import com.radcortez.quarkus.extensions.runtime.LibraryProducer;
import com.radcortez.quarkus.extensions.runtime.LibraryRecorder;
import com.radcortez.quarkus.extensions.runtime.TestRecorder;

import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.ExecutionTime;
import io.quarkus.deployment.annotations.Record;
import io.quarkus.deployment.builditem.ServiceStartBuildItem;

public class LibraryProcessor {
    @BuildStep
    void library(BuildProducer<LibraryBuildItem> library, BuildProducer<AdditionalBeanBuildItem> additionalBeans) {
        library.produce(new LibraryBuildItem(new SaiyanTransform().superSaiyan()));
        additionalBeans.produce(new AdditionalBeanBuildItem(LibraryProducer.class));
    }

    @BuildStep
    @Record(ExecutionTime.STATIC_INIT)
    ServiceStartBuildItem init(
            LibraryRecorder recorder,
            LibraryBuildItem library) {

        recorder.registerLibrary(library.getLibrary());

        return new ServiceStartBuildItem("library");
    }

    @BuildStep
    @Record(ExecutionTime.RUNTIME_INIT)
    void buildMappingRecorder(ConfigMappingBuildAndRunTimeFixed buildFixed, TestRecorder recorder) {
        recorder.configure(buildFixed);
    }
}
