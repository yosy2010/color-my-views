package com.tamimi.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // make the boxes colored depending on which view was clicked
    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    // create a group of the buttons and attach an onClickListener to each of them by looping through them
    // inside the onClickListener we call makeColored and pass it the view that was clicked
    private fun setListener() {
        val clickableViews = listOf(
            box_one_text,
            box_two_text,
            box_three_text,
            box_four_text,
            box_five_text,
            constrain_layout
        )

        clickableViews.forEach { view ->
            view.setOnClickListener {
                makeColored(view)
            }
        }
    }

    // we call setListener to set a listener for all boxes + the constraint layout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

}
