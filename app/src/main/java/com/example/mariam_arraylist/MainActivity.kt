package com.example.mariam_arraylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    private var names = arrayListOf<String>()// مايحتاج اعرف الحجم
    lateinit var layout: LinearLayout
    lateinit var Name: EditText
    lateinit var Number: EditText
    lateinit var ADD: Button
    lateinit var show: Button
    lateinit var Result: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        layout = findViewById(R.id.Show)
        Name = findViewById(R.id.Namer1)
        Number = findViewById(R.id.etNumber)
        ADD = findViewById(R.id.ADD)
        show = findViewById(R.id.showBtton)
        Result = findViewById(R.id.Result)

        layout.isVisible = false

        ADD.setOnClickListener {
            names.add(Name.text.toString())

            if (names.size >= 10)
                layout.isVisible = true
            Name.text.clear()
        }

        show.setOnClickListener {
            Result.text = "${names[Number.text.toString().toInt()-1]}\n"
        }

    }

}