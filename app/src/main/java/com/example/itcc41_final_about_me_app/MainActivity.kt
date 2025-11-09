package com.example.itcc41_final_about_me_app

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Setup all cards
        setupCard(
            nameId = R.id.name_kate,
            descId = R.id.desc_kate,
            buttonId = R.id.btn_kate_gthb
        )

        setupCard(
            nameId = R.id.name_ydrick,
            descId = R.id.desc_ydrick,
            buttonId = R.id.btn_ydrick_gthb
        )

        setupCard(
            nameId = R.id.name_sai,
            descId = R.id.desc_sai,
            buttonId = R.id.btn_3_gthb_sai
        )

        setupCard(
            nameId = R.id.name_ethan,
            descId = R.id.desc_ethan,
            buttonId = R.id.btn_4_gthb_ethan
        )

        setupCard(
            nameId = R.id.name_5_sandy,
            descId = R.id.desc_sandy,
            buttonId = R.id.btn_5_gthb_sandy
        )
    }

    /**
     * Setup function for each card to handle expand/collapse
     */
    private fun setupCard(
        nameId: Int,
        descId: Int,
        buttonId: Int
    ) {
        val nameView = findViewById<TextView>(nameId)
        val descView = findViewById<LinearLayout>(descId)
        // Ensure this is a TextView, not a Button
        val buttonView = findViewById<TextView>(buttonId)

        // Animations (You may need to add simple fade_in and fade_out animations to your resources)
        val slideDown = AnimationUtils.loadAnimation(this, android.R.anim.fade_in)
        val slideUp = AnimationUtils.loadAnimation(this, android.R.anim.fade_out)

        // Clicking on name also toggles visibility (Optional, remove if you only want the button to toggle)
        nameView.setOnClickListener {
            toggleDescription(descView, slideDown, slideUp, buttonView)
        }

        // "Know More" button now toggles visibility
        buttonView.setOnClickListener {
            toggleDescription(descView, slideDown, slideUp, buttonView)
        }
    }

    /**
     * Handles smooth expand/collapse with fade animation and updates TextView text.
     */
    private fun toggleDescription(
        descView: LinearLayout,
        slideDown: android.view.animation.Animation,
        slideUp: android.view.animation.Animation,
        buttonView: TextView
    ) {
        if (descView.visibility == View.GONE) {
            descView.startAnimation(slideDown)
            descView.visibility = View.VISIBLE
            buttonView.text = "Show Less"
        } else {
            descView.startAnimation(slideUp)
            descView.visibility = View.GONE
            buttonView.text = getString(R.string.text_know_more)
        }
    }
}