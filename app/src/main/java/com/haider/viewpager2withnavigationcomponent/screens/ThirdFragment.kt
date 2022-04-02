package com.haider.viewpager2withnavigationcomponent.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.haider.viewpager2withnavigationcomponent.R
import com.haider.viewpager2withnavigationcomponent.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentThirdBinding.inflate(layoutInflater)


        binding.finish.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
            onBoardingFinished()
        }

        return binding.root
    }


    private fun onBoardingFinished() {
        val sharedPre = activity?.getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPre?.edit()
        editor?.putBoolean("Finished", true)
        editor?.apply()
    }

}