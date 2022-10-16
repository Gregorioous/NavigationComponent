package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigationcomponent.databinding.FragmentHomeBinding


class Home : Fragment() {
    private var binding:FragmentHomeBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)


        binding?.butCatalog?.setOnClickListener(View.OnClickListener {
                view?.findNavController()?.navigate(R.id.action_home2_to_catalog)
        })

        binding?.image?.setImageResource(R.drawable.mushroom)

        return binding?.root
    }


    }
