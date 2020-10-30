package com.example.snackbar

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.home_fragment.view.*

class HomeFragment : Fragment() {
    private var listGastos = getListGastos()
    private val adapter = DetailGastosAdapter(listGastos)
    fun getListGastos(): ArrayList<Gasto> {
        var gasto0 = Gasto("desc", "cat", "datahora", 1.0)
        var gasto1 = Gasto("desc", "cat", "datahora", 1.0)
        var gasto2 = Gasto("desc", "cat", "datahora", 1.0)

        val listaEntrada = arrayListOf<Gasto> (gasto0, gasto1, gasto2)
        return listaEntrada
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.home_fragment, container, false)
        view.rcListaEntradas.adapter = adapter
        view.rcListaEntradas.layoutManager = LinearLayoutManager(context)
        view.rcListaEntradas.setHasFixedSize(true)
        view.btAdicionar.setOnClickListener {
            insertGasto()
        }
        view.btRemover.setOnClickListener {
            removeGasto()
        }
        return view
    }

    companion object{
        fun newInstance() = HomeFragment()
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(context, "onAttach HomeFragment", Toast.LENGTH_SHORT).show()
    }
    fun insertGasto(){
        val entrada3 = Gasto("Almoço", "fixo", "13/10/2020", 15.0)
        listGastos.add(entrada3)
        adapter.notifyItemInserted(listGastos.size)
    }
    fun removeGasto(){
        listGastos.removeAt(listGastos.size - 1)
        adapter.notifyItemRemoved(listGastos.size - 1)
    }

}