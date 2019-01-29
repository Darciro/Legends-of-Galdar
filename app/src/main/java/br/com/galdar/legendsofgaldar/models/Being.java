package br.com.galdar.legendsofgaldar.models;

public class Being {

    private String name;
    private String level;
    private String charClass;

    // public Being() {}

    public Being(String name, String level, String charClass) {
        this.name = name;
        this.level = level;
        this.charClass = charClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }
}
