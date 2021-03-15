package com.enigmacamp.mynavigation.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enigmacamp.mynavigation.MainActivity
import com.enigmacamp.mynavigation.R
import kotlinx.android.synthetic.main.fragment_transaction.*

class TransactionFragment() : Fragment(), View.OnClickListener {

    var balance: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transaction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_sell.setOnClickListener(this)
        btn_buy.setOnClickListener(this)
    }


    fun updateBalance(balance: Int) {
        textViewBalance.text = balance.toString()
    }

    fun handelBuy(stock: Int) {
        balance = balance + stock
        updateBalance(balance)
    }

    fun handelSell(stock: Int) {
       balance =  balance - stock
       updateBalance(balance)
    }

    override fun onClick(v: View?) {
        when (v) {
            btn_buy -> {
                handelBuy(textInputTransaction.text.toString().toInt())
            }
            btn_sell -> {
                handelSell(textInputTransaction.text.toString().toInt())
            }
        }
    }
}