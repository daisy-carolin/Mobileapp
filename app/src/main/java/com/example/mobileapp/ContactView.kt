package com.example.mobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class ContactView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_view)

    val tvName=findViewById<TextView>(R.id.tvName)
    val tvEmail=findViewById<TextView>(R.id.tvEmail)
    val tvPhoneNumber=findViewById<TextView>(R.id.tvPhoneNumber)
    val ivprofile=findViewById<ImageView>(R.id.ivprofile)


    var nameInt=intent.getStringExtra("Name")
    var emailInt=intent.getStringExtra("Email")
    var phonenumberInt=intent.getStringExtra("PhoneNumber")
    var imageView=intent.getStringExtra("Profile")
    Picasso.get().load(imageView).into(ivprofile)

        tvName.text=nameInt
        tvEmail.text=emailInt
        tvPhoneNumber.text=phonenumberInt
     }

}