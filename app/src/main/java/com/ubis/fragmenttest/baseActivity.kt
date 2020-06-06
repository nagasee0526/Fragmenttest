package com.ubis.fragmenttest

import androidx.appcompat.app.AppCompatActivity

abstract  class baseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setupValues()
    abstract fun setupEnents()
}