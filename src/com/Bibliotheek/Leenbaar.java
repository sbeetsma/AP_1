package com.Bibliotheek;
public interface Leenbaar {

    String getTitel();

    void setTitel(String Titel);

    String getBeschrijving();

    void setBeschrijving(String Beschrijving);

    boolean getBeschikbaar();

    void setBeschikbaar(boolean Beschikbaar);

    void Huren();

    void Inleveren();

    String toString();

}