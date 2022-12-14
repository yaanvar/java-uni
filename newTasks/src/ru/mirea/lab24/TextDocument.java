package ru.mirea.lab24;

public class TextDocument extends IDocument {

    private String stContent;

    private int iTextLength;

    public TextDocument() {
        this.stFolder = "Default";
        this.iSize = 80;
        this.stName = "Default";
        this.stContent = "";
        this.iTextLength = 0;
    }

    public TextDocument(String stFolder, String stName, int iSize) {
        this.stFolder = stFolder;
        this.stName = stName;
        this.iSize = iSize;
        this.stContent = "";
        this.iTextLength = 0;
    }

    public TextDocument(String stContent, String stFolder, String stName, int iSize) {
        this.stContent = stContent;
        this.iTextLength = stContent.length();
    }

    public String getContent() {
        return stContent;
    }

    public void setContent(String stContent) {
        this.stContent = stContent;
    }

    public int getTextLength() {
        return iTextLength;
    }

    public void setTextLength(int iTextLength) {
        this.iTextLength = iTextLength;
    }
}