package com.ufrn.imd.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estoque {
    private int idEstoque;
    private Loja loja;
    private String descricao;
    private String prateleira;
    private String secao;
    private String localizacaoEstoque;
    private List<Produto> produtos;
}
