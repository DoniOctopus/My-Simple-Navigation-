package com.enigmacamp.mynavigation.nav_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.enigmacamp.mynavigation.R
import kotlinx.android.synthetic.main.fragment_navigation.*

class NavigationFragment : Fragment(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navigation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_home.setOnClickListener(this)
        btn_trx.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            btn_home -> findNavController().navigate(R.id.action_navigationFragment_to_homeFragment)
            btn_trx -> findNavController().navigate(R.id.action_navigationFragment_to_transactionFragment)
        }
    }
}