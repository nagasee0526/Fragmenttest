package com.ubis.fragmenttest.fregments

import androidx.fragment.app.Fragment

abstract class basefragment : Fragment() {

    abstract fun setupEvents()
    abstract fun setupValues()
}