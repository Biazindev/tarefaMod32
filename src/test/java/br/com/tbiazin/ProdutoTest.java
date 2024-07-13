package br.com.tbiazin;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import br.com.tbiazin.Dao.IProdutoDao;
import br.com.tbiazin.Dao.ProdutoDao;
import br.com.tbiazin.Domain.Produto;

public class ProdutoTest {

    private IProdutoDao produtoDao;
    
    @Before
    public void setup() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setValor(1500d);
        produto.setNome("Curso de Java Backend");
        produto = produtoDao.cadastrar(produto);
        
        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
