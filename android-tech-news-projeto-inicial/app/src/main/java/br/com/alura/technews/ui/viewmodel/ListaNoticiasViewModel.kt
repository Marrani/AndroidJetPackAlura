package br.com.alura.technews.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.alura.technews.model.Noticia
import br.com.alura.technews.repository.NoticiaRepository
import br.com.alura.technews.repository.Resource

class ListaNoticiasViewModel(private val repository: NoticiaRepository

) : ViewModel() {

    fun buscaTodos() : LiveData<Resource<List<Noticia>?>> {
        return repository.buscaTodos()

    }

    class PersonagemViewModelFactory(
        private val repository: NoticiaRepository
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return ListaNoticiasViewModel(repository) as T
        }
    }

}