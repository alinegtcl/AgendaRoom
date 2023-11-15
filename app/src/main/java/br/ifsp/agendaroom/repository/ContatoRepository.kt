package br.ifsp.agendaroom.repository

import androidx.lifecycle.LiveData
import br.ifsp.agendaroom.data.Contato
import br.ifsp.agendaroom.data.ContatoDAO

class ContatoRepository (private val contatoDAO: ContatoDAO) {

    suspend fun insert(contato: Contato){
        contatoDAO.insert(contato)
    }

    suspend fun update(contato: Contato){
        contatoDAO.update(contato)
    }

    suspend fun delete(contato: Contato){
        contatoDAO.delete(contato)
    }

    fun getAllContacts(): LiveData<List<Contato>> {
        return contatoDAO.getAllContacts()
    }

    fun getContactById(id: Int): LiveData<Contato>{
        return contatoDAO.getContactById(id)
    }

}