package com.example.primertallerpractico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import com.example.primertallerpractico.R

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.operaciones)

        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button=findViewById<Button>(R.id.button)
        val spinner=findViewById<Spinner>(R.id.spinner)

        val lista = arrayOf("sumar", "restar", "multiplicar", "dividir")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)
        spinner.adapter = adaptador1

        button.setOnClickListener {
            when (spinner.selectedItem.toString()) {
                "sumar" -> tv1.text = "Resultado: ${et1.text.toString().toInt() + et2.text.toString().toInt()}"
                "restar" -> tv1.text = "Resultado: ${et1.text.toString().toInt() - et2.text.toString().toInt()}"
                "multiplicar" -> tv1.text = "Resultado: ${et1.text.toString().toInt() * et2.text.toString().toInt()}"
                "dividir" -> tv1.text = "Resultado: ${et1.text.toString().toInt() / et2.text.toString().toInt()}"
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
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }

}