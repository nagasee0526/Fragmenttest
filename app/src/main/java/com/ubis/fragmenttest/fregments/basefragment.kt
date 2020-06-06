package com.ubis.fragmenttest.fregments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class basefragment : Fragment() {

    lateinit var mContext : Context

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //액티비티 생성후 프래그먼트를 가지고있는 액티비티의 context 를 가져온다.
        mContext = activity as Context
    }

    abstract fun setupEvents()
    abstract fun setValues()
}