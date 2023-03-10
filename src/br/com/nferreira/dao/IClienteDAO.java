package br.com.nferreira.dao;

import br.com.nferreira.domain.Cliente;

import java.util.Collection;
import java.util.List;

public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();

}
