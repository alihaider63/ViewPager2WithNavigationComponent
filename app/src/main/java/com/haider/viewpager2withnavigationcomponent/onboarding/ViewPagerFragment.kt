package com.haider.viewpager2withnavigationcomponent.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.haider.viewpager2withnavigationcomponent.R
import com.haider.viewpager2withnavigationcomponent.databinding.FragmentViewPagerBinding
import com.haider.viewpager2withnavigationcomponent.screens.FirstFragment
import com.haider.viewpager2withnavigationcomponent.screens.SecondFragment
import com.haider.viewpager2withnavigationcomponent.screens.ThirdFragment

class ViewPagerFragment : Fragment() {

    lateinit var binding: FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentViewPagerBinding.inflate(layoutInflater)


        val fragmentList = arrayListOf<Fragment>(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        binding.viewPagerId.adapter = adapter

        return binding.root
    }

}