/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author User
 */
public class Clientes {
    private int Id;
    private String Nome;

    public Clientes(int Id, String Nome) {
        this.Id = Id;
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    
}
