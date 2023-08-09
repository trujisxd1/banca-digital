package com.banca.digital.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO" ,length = 4)
@NoArgsConstructor
@AllArgsConstructor
public class CuentaBancaria {

    @Id
    private Integer id;

    private double balance;

    private Date fechaDeCreacion;


    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "cuentaBancaria")
    private List<OperacionCuenta>operacionCuentas;



}
