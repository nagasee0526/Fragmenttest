package com.ubis.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ubis.fragmenttest.adapters.myViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : baseActivity() {

    lateinit var myAdapter : myViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
        setupEnents()
    }

    override fun setValues() {
        myAdapter = myViewAdapter(supportFragmentManager)
        myViewPager.adapter = myAdapter
    }

    override fun setupEnents() {
    }
}
