package com.haider.viewpager2withnavigationcomponent.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.haider.viewpager2withnavigationcomponent.R
import com.haider.viewpager2withnavigationcomponent.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(layoutInflater)

        val viewPager2 = activity?.findViewById<ViewPager2>(R.id.viewPagerId)

        binding.nextBtnFastDelivery.setOnClickListener {
            viewPager2?.currentItem = 2
        }

        return binding.root
    }

}