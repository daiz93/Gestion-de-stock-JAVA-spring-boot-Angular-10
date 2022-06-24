package com.demo.gestiondestocks.dto;

import com.demo.gestiondestocks.model.Categorie;
import com.demo.gestiondestocks.model.Client;
import lombok.*;


import javax.persistence.*;
import java.util.List;

@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@EqualsAndHashCode(callSuper = true)
//@Table(name="ClientDto")

public class ClientDto  {
    private Integer id;

    private String nom;

    private String preNom;

    public AdresseDto AdresseDto;

    private String photo;
    //@Column (name = "email")
    private String email;
    //@Column(name = "tel")
    private String tel;

    //@OneToMany(mappedBy = "ClientDto")
    List<CommandeClientDto> commandeClients;

//    //@OneToMany (mappedBy ="VenteDto")
//    List<VenteDto> ventes;

    public ClientDto fromEntity (Client client)
    {
        if (client == null)
        {
            //TODO
            return null;
        }
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .preNom(client.getPreNom())
                .email(client.getEmail())
                .tel(client.getTel())
                .photo(client.getPhoto())

                .build();

    }

    public Client toEntity (ClientDto clientdto)
    {
        if (clientdto == null)
        {
            //TODO
            return  null;
        }
        Client client = new Client();
        client.setId(clientdto.getId());
        client.setNom(clientdto.getNom());
        client.setPreNom(clientdto.getPreNom());
        client.setEmail(clientdto.getEmail());
        client.setTel(clientdto.getTel());
        client.setPhoto(clientdto.getPhoto());
       // client.setAdresse(clientdto.getAdresseDto());
        return client;


    }

}
