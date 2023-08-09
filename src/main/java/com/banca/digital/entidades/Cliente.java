package com.banca.digital.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String email;

    //un cliente tiene muchas cuentas bancarias
    @OneToMany(mappedBy = "cliente")
   private List<CuentaBancaria> cuentaBancarias;




}
