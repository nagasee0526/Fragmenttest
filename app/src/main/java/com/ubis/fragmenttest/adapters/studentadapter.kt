package com.ubis.fragmenttest.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.ubis.fragmenttest.R
import com.ubis.fragmenttest.datas.students
import kotlinx.android.synthetic.main.activity_student_list_item.view.*

class studentadapter(context: Context, resId: Int, list: List<students>) : ArrayAdapter<students>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        tempRow?.let {

        }.let {
            tempRow = inf.inflate(R.layout.activity_student_list_item, null)
        }

        val row = tempRow!!

        // 실제 값 반영
        val studentInfoTxt = row.findViewById<TextView>(R.id.studentInfo)
        val data = mList.get(position)
        val age = 2020 - data.birthyear + 1
        var gender = "남성"
        if( !data.gneder ) {
            gender = "여성"
        }

        studentInfoTxt.text = "${data.name}(${age}세, ${gender})"

        return row
    }
            //자리에 맞는 데이터 불러오기
//        val data = mList.get(position)

        // XML에서 데이터가 뿌려질 뷰를 가져오자
 //       val nameAndAgeTxt = row.findViewById<TextView>(R.id.nameAndAgeTxt)

  //      nameAndAgeTxt.text = data.name
}