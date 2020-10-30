package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        var obj_pessoa = intent.getSerializableExtra("key") as? Pessoa
        Toast.makeText(applicationContext, obj_pessoa!!.username,Toast.LENGTH_LONG).show()
        val et_user = findViewById(R.id.et_user) as EditText
        et_user.setText(obj_pessoa.username)
        val et_senha = findViewById(R.id.edPassword1) as EditText
        et_senha.setText(obj_pessoa.senha)
    }
}