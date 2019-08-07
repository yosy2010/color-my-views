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
            R.id.box_five_text -> view.setBackgroundColor(Color.RED)
            R.id.box_six_text -> view.setBackgroundColor(Color.BLACK)
            R.id.box_seven_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_eight_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_nine_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_ten_text -> view.setBackgroundColor(Color.RED)

            R.id.red_button -> {
                box_one_text.setBackgroundResource(R.color.my_red)
                box_three_text.setBackgroundResource(R.color.my_red)
                box_five_text.setBackgroundResource(R.color.my_red)
                box_ten_text.setBackgroundResource(R.color.my_red)
            }


            R.id.yellow_button -> {
                box_two_text.setBackgroundResource(R.color.my_yellow)
                box_four_text.setBackgroundResource(R.color.my_yellow)
                box_six_text.setBackgroundResource(R.color.my_yellow)
                box_seven_text.setBackgroundResource(R.color.my_yellow)
            }


            R.id.green_button -> {
                box_three_text.setBackgroundResource(R.color.my_green)
                box_eight_text.setBackgroundResource(R.color.my_green)
                box_ten_text.setBackgroundResource(R.color.my_green)
                box_one_text.setBackgroundResource(R.color.my_green)
            }



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
            box_six_text,
            box_seven_text,
            box_eight_text,
            box_nine_text,
            box_ten_text,
            constrain_layout,
            red_button,
            green_button,
            yellow_button
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
