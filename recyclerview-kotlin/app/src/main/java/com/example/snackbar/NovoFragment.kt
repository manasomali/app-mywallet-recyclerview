package com.example.snackbar

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_novo.view.*

class NovoFragment : Fragment() {
    private var msg = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_novo, container, false)
        view.txtNovoFrag.text = msg
        return view
    }

    companion object{
        @JvmStatic
        fun newInstance(msg: String) = NovoFragment().apply {
            arguments = Bundle().apply {
                putString("key", msg)
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        arguments?.getString("key")?.let {
            msg = it
        }
    }


}