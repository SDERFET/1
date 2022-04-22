package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import android.widget.SeekBar.OnSeekBarChangeListener as OnSeekBarChangeListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val text = findViewById<TextView>(R.id.text)
        seekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                }

            override fun onStopTrackingTouch(p0: SeekBar) {
                text.text = p0.progress.toString()
               }
        })
        seekBar.setProgress(10)
        seekBar.incrementProgressBy(15)
        seekBar.setMax(90)
        seekBar.getProgress()
        seekBar.getMax()
    }
}



