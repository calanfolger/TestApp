package com.vogella.android.testapp

import android.support.v7.app.AppCompatActivity
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_create_user.*


class CreateUserActivity : AppCompatActivity() {
    internal var male = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
        val radioGroup = findViewById<View>(R.id.gender) as RadioGroup
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.male -> male = true
                R.id.female -> male = false
            }
        }

    }

    fun onClick(view: View) {
        val input = findViewById<View>(R.id.username) as EditText
        val string = input.text.toString()
        Toast.makeText(this, "User $string created.", Toast.LENGTH_LONG).show()
        if (male) {
            Toast.makeText(this, "User $string has decided to be male.", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "User $string has decided to be female.", Toast.LENGTH_LONG).show()
        }
    }
}

