package com.example.snackbar

import android.app.DatePickerDialog
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.fragment_novo.view.*
import kotlinx.android.synthetic.main.gastos_fragment.view.*
import java.util.*

class GastosFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater!!.inflate(R.layout.gastos_fragment, container, false)
        view.edDataHora.addTextChangedListener(MaskEditUtil.mask(view.edDataHora, MaskEditUtil.FORMAT_DATE_HOUR));
        return view
    }


    companion object{
        fun newInstance() = GastosFragment()
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(context, "onAttach GastosFragment", Toast.LENGTH_SHORT).show()
    }



}