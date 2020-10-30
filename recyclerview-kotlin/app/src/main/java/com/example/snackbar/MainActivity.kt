package com.example.snackbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.login_body.*

class MainActivity : AppCompatActivity(), ContractMainActivity {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val frag = HomeFragment.newInstance()
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.FragmentMainId, frag);
            commit()
        }
        alterColorHome(R.color.colorVinho)
        ButtonEntradaId.setOnClickListener {
            alterColorEntrada(R.color.colorVinho)
            alterColorGasto(R.color.colorWhite)
            alterColorHome(R.color.colorWhite)
            val frag = EntradaFragment.newInstance()
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.FragmentMainId, frag);
                commit()
            }
        }

        ButtonGastosId.setOnClickListener {
            alterColorEntrada(R.color.colorWhite)
            alterColorGasto(R.color.colorVinho)
            alterColorHome(R.color.colorWhite)
            val frag = GastosFragment.newInstance()
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.FragmentMainId, frag);
                commit()
            }
        }

        ButtonHomeId.setOnClickListener {
            alterColorEntrada(R.color.colorWhite)
            alterColorGasto(R.color.colorWhite)
            alterColorHome(R.color.colorVinho)
            val frag = HomeFragment.newInstance()
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.FragmentMainId, frag);
                commit()
            }
        }
        setSupportActionBar(findViewById(R.id.id_toolbar))
        getSupportActionBar()?.setDisplayShowTitleEnabled(true)
        id_toolbar.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var itemView = item.itemId

        when(itemView) {
            R.id.menu_perfil -> {
                showToast("Profile")
                var intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            }
        }

        return false
    }

    override fun chamaFragmentoDetails() {
        val frag = NovoFragment.newInstance("Lista de Gastos")
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.flFragDetails, frag);
            commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.ico_toolbar, menu)
        return true
    }

    fun alterColorHome(idCor: Int){
        ButtonHomeId.setTextColor(ContextCompat.getColor(this, idCor));
    }

    fun alterColorEntrada(idCor: Int){
        ButtonEntradaId.setTextColor(ContextCompat.getColor(this, idCor));
    }

    fun alterColorGasto(idCor: Int){
        ButtonGastosId.setTextColor(ContextCompat.getColor(this, idCor));
    }
    fun showToast(msg:String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }
}