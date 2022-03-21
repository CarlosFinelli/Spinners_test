package com.example.spinnerstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val autoComplete = findViewById<AutoCompleteTextView>(R.id.autoComplete)
        val autoCompleteFilled = findViewById<AutoCompleteTextView>(R.id.autoComplete_filled)

        val type = arrayOf ("Bed-sitter", "Single", "1 - Bedroom", "2 - Bedroom", "3 - Bedroom")
        val adapter = ArrayAdapter(this, R.layout.drop_down_item, type)

        autoComplete.setAdapter(adapter)
        autoCompleteFilled.setAdapter(adapter)
        spinner.adapter = adapter

        autoComplete.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, autoComplete.text.toString(), Toast.LENGTH_SHORT).show()
        }

        autoCompleteFilled.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, autoComplete.text.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}