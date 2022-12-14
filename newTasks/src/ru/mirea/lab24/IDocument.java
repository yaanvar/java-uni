package ru.mirea.lab24;
public abstract class IDocument {

    protected int iSize = 0;

    protected String stName = "";
    protected String stFolder = "";

    public abstract String getContent();

    public abstract void setContent(String content);


    public int getSize() {
        return iSize;
    }

    public void setSize(int iSize) {
        this.iSize = iSize;
    }

    public String getName() {
        return stName;
    }

    public void setName(String stName) {
        this.stName = stName;
    }

    public String getFolder() {
        return stFolder;
    }

    public void setFolder(String stFolder) {
        this.stFolder = stFolder;
    }
}