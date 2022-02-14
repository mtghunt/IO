package ru.io.file;

import java.io.File;
import java.io.FilenameFilter;

public class MyFileNameFilter  implements  FilenameFilter{

    public boolean accept(File dir, String name) {
        return name.contains("person");
    }
}
