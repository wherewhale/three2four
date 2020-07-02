package com.example.three2four


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.three2four.Data.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, OneFragment())
                .commit()
        }
        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, TwoFragment().apply {
                    arguments = Bundle().apply {
                        putString("key", EXTRA_MESSAGE)
                    }
                })
                .commit()
        }


    }


}
