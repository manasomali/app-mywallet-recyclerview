package com.example.snackbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_profile.view.*

class FragmentProfile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_profile, container, false)
        view.buttonAjudaId.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentProfile_to_ajudaFragment)
        }
        view.buttonDadosId.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentProfile_to_dadosFragment)
        }
        return view
    }
}