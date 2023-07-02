package com.num1.summerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    fun onClick(view: View)
    {
        var inPussyCleanPussyFresh1 = findViewById<EditText>(R.id.editTextText4)
        var inPussyCleanPussyFresh2 = findViewById<EditText>(R.id.editTextText3)
        var inPussyCleanPussyFresh3 = findViewById<EditText>(R.id.editTextText)
        var inPussyCleanPussyFresh4 = findViewById<EditText>(R.id.editTextText2)

        var outPussyCleanPussyFresh = findViewById<TextView>(R.id.editTextText4)

        var kurkulmeter: Float = 0f
        val name = inPussyCleanPussyFresh1.text.toString()
        val height = inPussyCleanPussyFresh2.text.toString().toInt()
        val weight = inPussyCleanPussyFresh3.text.toString().toFloat()
        val age = inPussyCleanPussyFresh4.text.toString().toInt()


        if(name.contains("К")){
            kurkulmeter = kurkulmeter + 0.5f
        }
        if(height<=150){
            kurkulmeter = kurkulmeter + 0.5f
        }
        if(weight>=80){
            kurkulmeter = kurkulmeter + 0.5f
        }
        if(age>=60){
            kurkulmeter = kurkulmeter + 0.5f
        }
        else if(age<=13){
            kurkulmeter = kurkulmeter + 0.5f
        }
        var value = ""
        if (kurkulmeter >= 1f){
            value="Вы куркуль"
        }
        else{
            value="Вы не куркуль"
        }
        outPussyCleanPussyFresh.text = "$value"

    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainButton = findViewById<Button>(R.id.button)

        mainButton.setOnClickListener { onClick(it) }

    }
}