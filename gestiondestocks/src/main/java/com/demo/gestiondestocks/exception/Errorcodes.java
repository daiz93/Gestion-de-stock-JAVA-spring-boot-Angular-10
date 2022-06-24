package com.demo.gestiondestocks.exception;

public enum  Errorcodes {

    ARTICLES_NOT_FOUND(1000),

    ARTICLES_NOT_VALID(1001),
    CATEGORIE_NOT_FOUND(2000),
    COMMANDE_CLIENT_NOT_FOUND(3000),
    COMMANDE_FOURNISSEUR_NOT_FOUND(4000),
    ENTREPRISE_NOT_FOUND(5000),
    UTILISATEUR_NOT_FOUND(6000),
    VENTE_NOT_FOUND(7000),
    ;


    private int code;

    Errorcodes (int code) {
        this.code = code;
    }

    public int getCode()
    {
        return code;
    }


}
