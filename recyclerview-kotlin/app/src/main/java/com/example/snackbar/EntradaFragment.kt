package com.example.snackbar

import android.app.Activity
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.entrada_fragment.*

class EntradaFragment : Fragment() {
    private lateinit var cma: ContractMainActivity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.entrada_fragment, container, false)
        val fab = view!!.findViewById(R.id.floatingActionButtonId) as FloatingActionButton
        fab.setOnClickListener {
            cma.chamaFragmentoDetails()
        }
        return view
    }

    companion object{
        fun newInstance() = EntradaFragment()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ContractMainActivity) cma = context
    }


}