package com.example.mydesign.data

import com.example.mydesign.R
import com.example.mydesign.model.Shares

class Datasource {

    fun loadData(): List<Shares>{
       return listOf<Shares>(
           Shares(R.string.company_share1, R.string.company_name1, R.drawable.img1),
           Shares(R.string.company_share2, R.string.company_name2, R.drawable.img2),
           Shares(R.string.company_share3, R.string.company_name3, R.drawable.img3)
       )
    }

}