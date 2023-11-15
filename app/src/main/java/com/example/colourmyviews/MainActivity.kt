package com.example.colourmyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    val view1 : View = findViewById(R.id.box_one_text)
    val view2 : View = findViewById(R.id.box_two_text)
    val view3 : View = findViewById(R.id.box_three_text)
    val view4 : View = findViewById(R.id.box_four_text)
    val view5 : View = findViewById(R.id.box_five_text)

    private fun setListeners() {
        val clickableViews: List<View> =
           listOf(view1, view2, view3,
               view4, view5)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
    private fun makeColored(view: View) {
        when (view.id) {

            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}