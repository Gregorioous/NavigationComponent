package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigationcomponent.databinding.FragmentAccountBinding
import com.example.navigationcomponent.databinding.FragmentCatalogBinding


class Account : Fragment() {
    private var binding: FragmentAccountBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_account,container,false)

        binding?.butHome?.setOnClickListener(View.OnClickListener {
            view?.findNavController()?.navigate(R.id.action_account_to_home2)
        })

        return binding?.root
    }


    }
