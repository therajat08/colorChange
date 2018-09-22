package com.example.rajat.colorchange

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun magic(view: View){
        val buSelected = view as Button

        when(buSelected.id){
            R.id.buBlue->{
                color.setBackgroundColor(Color.BLUE)
                color.setText("Blue")
            }
            R.id.buGreen->{
                color.setBackgroundColor(Color.GREEN)
                color.setText("Green")
            }
            R.id.buRed->{
                color.setBackgroundColor(Color.RED)
                color.setText("Red")
            }
        }
    }
    fun reset(view: View)
    {
        color.setText("Color appears here")
        color.setBackgroundColor(Color.GRAY)
    }
}
