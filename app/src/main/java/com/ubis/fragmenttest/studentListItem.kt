package com.ubis.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class studentListItem : baseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list_item)

        setupEnents()
        setupValues()
    }

    override fun setupValues() {
    }

    override fun setupEnents() {
    }
}

