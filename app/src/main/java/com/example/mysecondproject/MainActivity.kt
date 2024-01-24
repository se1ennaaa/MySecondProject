package com.example.mysecondproject
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.answer)
        val answerBt = findViewById<Button>(R.id.answerBt)

        answerBt.setOnClickListener {

            val value = editTextName.text.toString()
            if (value == "Лягушка") {
                Toast.makeText(this, "молодец", Toast.LENGTH_SHORT).show()
            }
         else {
            Toast.makeText(this, "подумай дурак", Toast.LENGTH_SHORT).show()
        }
    }}}









