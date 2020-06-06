package com.ubis.fragmenttest.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ubis.fragmenttest.fregments.firstFragment
import com.ubis.fragmenttest.fregments.secondFragment

class myViewAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        if(position == 0) return "내 프로필"
        else return "수강생 목록"
    }
    override fun getItem(position: Int): Fragment {
        if(position == 0) return firstFragment()
        else return secondFragment()
    }

    override fun getCount(): Int {
        return 2
    }


}