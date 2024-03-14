package com.ufrn.imd.models;

import com.ufrn.imd.enums.TipoMovimentacao;

import java.time.LocalDate;

public class Movimentacao {
    private int idMovimentacao;
    private TipoMovimentacao tipoMovimentacao;
    private Estoque estoque;
    private Usuario usuario;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
}
