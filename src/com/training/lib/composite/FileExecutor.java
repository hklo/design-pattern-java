package com.training.lib.composite;

import com.training.lib.Interface.IExecutor;

public class FileExecutor implements IExecutor {
    @Override
    public void run() {
        Folder fol1 = new Folder("F1");
        File f1 = new File("File1", 5);
        File f2 = new File("File2", 3);

        fol1.add(f1);
        fol1.add(f2);

        Folder fol2 = new Folder("F2");
        Folder fol3 = new Folder("F3");
        Folder fol4 = new Folder("F4");

        fol1.add(fol2);
        fol1.add(fol3);

        File f3 = new File("File3", 3);
        File f4 = new File("File4", 4);
        File f5 = new File("File5", 5);

        fol4.add(f5);
        fol3.add(fol4);

        fol2.add(f3);
        fol2.add(f4);

        fol1.copy("c");
    }
}
