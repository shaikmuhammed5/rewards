package com.example.rewards

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipboardManager
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toolbar
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val Pro: Button = findViewById(R.id.Pro)

        Pro.setOnClickListener {
            Toast.makeText(this,"Promo Applyed",Toast.LENGTH_SHORT).show()
        }

        val Copy: Button = findViewById(R.id.copyButton)

        Copy.setOnClickListener {
            Toast.makeText(this, "Copied", Toast.LENGTH_SHORT).show()
        }

        class MainActivity : AppCompatActivity() {

            @SuppressLint("MissingSuperCall")
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val editText = findViewById<EditText>(R.id.editText)
                val buttonCopy:Button = findViewById(R.id.copyButton)

                buttonCopy.setOnClickListener {
                    val text = editText.text.toString()
                    val clipboard = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
                    val clip = ClipData.newPlainText("text", text)
                    clipboard.setPrimaryClip(clip)
                    Toast.makeText(this, "Text copied to clipboard", Toast.LENGTH_SHORT).show()


                }
            }
        }




    }
}