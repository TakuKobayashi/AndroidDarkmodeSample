package net.taptappun.taku.kobayashi.androiddarkmodesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iconImageView = findViewById<ImageView>(R.id.image_icon)
        iconImageView.setImageResource(R.mipmap.setting_sample)
    }
}