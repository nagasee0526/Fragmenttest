package com.ubis.fragmenttest.fregments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ubis.fragmenttest.R
import com.ubis.fragmenttest.adapters.studentadapter
import com.ubis.fragmenttest.datas.students
import kotlinx.android.synthetic.main.secondfragment.*

class secondFragment : basefragment(){

    val studentList = ArrayList<students>()
    // Oncreate가 실행된이후에 내용을 채워야함
    // 변수는 멤버변수로 만들어두면 차후에 편리하다
    lateinit var nStudentAdapter:studentadapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.secondfragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
        studentList.add(students(name = "조경진", birthyear = 1988, gneder = true))
        studentList.add(students(name = "김광철", birthyear = 1966, gneder = true))
        studentList.add(students(name = "김재환", birthyear = 1993, gneder = true))
        studentList.add(students(name = "박수정", birthyear = 1994, gneder = false))
        studentList.add(students(name = "신용성", birthyear = 1988, gneder = true))
        studentList.add(students(name = "엄곤지", birthyear = 1984, gneder = false))
        studentList.add(students(name = "이현호", birthyear = 1981, gneder = true))

        nStudentAdapter = studentadapter(mContext, R.layout.activity_student_list_item, studentList)
        studentLitView.adapter = nStudentAdapter
    }

}