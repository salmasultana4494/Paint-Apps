package com.example.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintapp.PaintView.Companion.colorList
import com.example.paintapp.PaintView.Companion.currentColor
import com.example.paintapp.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {
    companion object{
        var path = Path()
        var paintBrush = Paint()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        val redButton = findViewById<ImageButton>(R.id.redColor)
        val blueButton = findViewById<ImageButton>(R.id.blueColor)
        val blackButton = findViewById<ImageButton>(R.id.blackColor)
        val eraser = findViewById<ImageButton>(R.id.whiteColor)

        redButton.setOnClickListener {
            Toast.makeText(this,"red button clicked",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }
        blueButton.setOnClickListener {
            Toast.makeText(this,"blue button clicked",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }
        blackButton.setOnClickListener {
            Toast.makeText(this,"black button clicked",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }
        eraser.setOnClickListener {
            Toast.makeText(this,"white button clicked",Toast.LENGTH_LONG).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }

    }

    private fun currentColor(color: Int){
        currentColor = color
        path = Path()
    }


}