package com.banca.digital.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class OperacionCuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date fechaOperaion;

    private double monto;

    @ManyToOne
    private CuentaBancaria cuentaBancaria;

    @OneToMany(mappedBy = "cuentaBancaria")
    private List<OperacionCuenta>operacionCuentas;
}
