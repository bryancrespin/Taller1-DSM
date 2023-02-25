package com.example.primertallerpractico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import com.example.primertallerpractico.R

class Main3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.salario)


        val et2=findViewById<EditText>(R.id.et2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button=findViewById<Button>(R.id.button)
        val spinner=findViewById<Spinner>(R.id.spinner)

        val lista = arrayOf("ISSS", "AFP", "RENTA")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)
        spinner.adapter = adaptador1

        button.setOnClickListener {
            when (spinner.selectedItem.toString()) {
                "ISSS" -> tv1.text = "Resultado: ${et2.text.toString().toInt() - (et2.text.toString().toInt())*(0.03)}"
                "AFP" -> tv1.text = "Resultado: ${et2.text.toString().toInt() - (et2.text.toString().toInt())*(0.04)}"
                "RENTA" -> tv1.text = "Resultado: ${et2.text.toString().toInt() - (et2.text.toString().toInt())*(0.05)}"

            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menuopciones, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.promedio1) {
            Toast.makeText(this, "Se seleccionó la primer opción", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Main1Activity::class.java)
            startActivity(intent)
        }
        if (id == R.id.salario1) {
            Toast.makeText(this, "Se seleccionó la segunda opción", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Main3Activity::class.java)
            startActivity(intent)
        }
        if (id == R.id.operaciones1) {
            Toast.makeText(this, "Se seleccionó la tercer opción", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Main3Activity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }

}