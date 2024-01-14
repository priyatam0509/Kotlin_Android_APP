package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//this line is inflating our laytout Here R stand fo res
        val roll_button:Button = findViewById(R.id.roll_button)
        roll_button.setOnClickListener {
            rollDice()
        }



    }

    private fun rollDice() {
        var diceImage:ImageView = findViewById(R.id.dice_image)
        var Rand_Int = Random().nextInt(6)+1
        var diceImage_output = when(Rand_Int){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImage.setImageResource(diceImage_output)



    }
}