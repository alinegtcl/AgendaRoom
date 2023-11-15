package br.ifsp.agendaroom.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface ContatoDAO {
    @Insert
    suspend fun inserirContato(contato: Contato)

    @Update
    suspend fun atualizarContato (contato: Contato)

    @Delete
    suspend fun apagarContato(contato: Contato)

    @Query("SELECT * FROM contato ORDER BY nome")
    fun listarContatos(): List<Contato>

}