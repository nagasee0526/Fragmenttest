package com.ubis.fragmenttest.fregments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ubis.fragmenttest.R
import kotlinx.android.synthetic.main.firstfragment.*

class firstFragment : basefragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.firstfragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setupEvents()
        setupValues()
    }

    override fun setupEvents() {

        ConnctBtn.setOnClickListener {
            val inputPhonnum = PhonNumEdt.text.toString()
            val MyUri = Uri.parse("tel:${inputPhonnum.replace("_", "")}")
            val myIntent = Intent(Intent.ACTION_DIAL, MyUri)
            startActivity(myIntent)
        }
    }

    override fun setupValues() {
    }
}