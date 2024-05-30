package com.radcortez.quarkus.extensions.application;

import com.radcortez.quarkus.extensions.library.Library;
import com.radcortez.quarkus.extensions.library.LibraryBuilder;

public class Main {
    public static void main(String[] args) {
        Library library = new LibraryBuilder().build();
        System.out.println(library.sayHello("Naruto"));
    }
}
