package ru.mirea.lab24;

import java.util.ArrayList;

public class CreateTextDocument implements ICreateDocument {

    ArrayList<IDocument> fabricFiles = new ArrayList<>();

    public IDocument CreateNew(String stFolder, String stName, int iSize) {
        IDocument newDocument = new TextDocument(stFolder, stName, iSize);
        fabricFiles.add(newDocument);
        return newDocument;
    }

    public IDocument CreateOpen(String stName) {
        return fabricFiles.stream().filter(IDocument -> stName.equals(IDocument.getName())).findFirst().orElse(new TextDocument());
    }
}
