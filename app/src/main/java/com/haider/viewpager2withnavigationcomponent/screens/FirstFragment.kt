package com.haider.viewpager2withnavigationcomponent.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.haider.viewpager2withnavigationcomponent.R
import com.haider.viewpager2withnavigationcomponent.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(layoutInflater)

        val viewPager2 = activity?.findViewById<ViewPager2>(R.id.viewPagerId)

        binding.nextBtnFreshFood.setOnClickListener {
            viewPager2?.currentItem = 1
        }

        return binding.root
    }

}