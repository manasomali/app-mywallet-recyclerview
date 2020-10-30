package com.example.snackbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login_body.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_cadastro.setOnClickListener {
            var intent = Intent(this, CadastroActivity::class.java)
            var obj_pessoa = Pessoa(edUserName.text.toString(), edPassword.text.toString())
            intent.putExtra("key", obj_pessoa)
            startActivity(intent)
        }
        btn_login.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}