package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigationcomponent.databinding.FragmentCatalogBinding
import com.example.navigationcomponent.databinding.FragmentHomeBinding




class Catalog : Fragment() {

    private var binding: FragmentCatalogBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_catalog,container,false)
        binding?.butAccount?.setOnClickListener(View.OnClickListener {
            view?.findNavController()?.navigate(R.id.action_catalog_to_account)
        })

        return binding?.root
    }


    }
