package com.example.quitzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart=findViewById<Button>(R.id.btn_start)
        val editName=findViewById<EditText>(R.id.edit_text)
        btnStart.setOnClickListener{
            if(editName.text.isEmpty()){
                Toast.makeText(this, "Please Enter Your name first.", Toast.LENGTH_SHORT).show()
            }else{
                val intent=Intent(this, quiz_activity::class.java)
                intent.putExtra(Constants.USER_NAME,editName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }

}