package com.coding.importsvgfileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.decode.SvgDecoder
import coil.load

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val onlineSvgImage = findViewById<ImageView>(R.id.onlineSvgImage)
        val svgUrl = "https://raw.githubusercontent.com/Coding-Meet/Coding-Meet/main/app_icon.svg"
        onlineSvgImage.load(svgUrl) {
            decoderFactory { result, options, _ -> SvgDecoder(result.source, options) }
                .placeholder(R.drawable.ic_placeholder)
                .error(R.drawable.ic_error)
        }
    }
}