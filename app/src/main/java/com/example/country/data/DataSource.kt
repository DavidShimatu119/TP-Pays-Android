package com.example.country.data

import com.example.country.R
import com.example.country.model.Country

class DataSource {
    fun loadCountries(): List<Country> {
        return listOf(
            Country(R.string.Finlande, R.string.Helsinki, R.string.FIN, R.string.finlande_desc, R.drawable.finland_flag),
            Country(R.string.Irlande, R.string.Dublin, R.string.IRL, R.string.irlande_desc, R.drawable.ireland_flag),
            Country(R.string.Islande, R.string.Reykjavik, R.string.ISL, R.string.islande_desc, R.drawable.iceland_flag),
            Country(R.string.Mexique, R.string.Mexico, R.string.MEX, R.string.mexique_desc, R.drawable.mexico_flag),
            Country(R.string.Nigeria, R.string.Abuja, R.string.NGA, R.string.nigeria_desc, R.drawable.nigeria_flag),
            Country(R.string.Norvege, R.string.Oslo, R.string.NOR, R.string.norvege_desc, R.drawable.norway_flag),
            Country(R.string.NouvelleZelande, R.string.Wellington, R.string.NZL, R.string.nz_desc, R.drawable.newzealand_flag),
            Country(R.string.RDCongo, R.string.Kinshasa, R.string.COD, R.string.rdc_desc, R.drawable.drc_flag),
            Country(R.string.RSudAfricaine, R.string.Pretoria, R.string.ZAF, R.string.sa_desc, R.drawable.zar_flag),
            Country(R.string.EtatsUnis, R.string.Washington, R.string.USA, R.string.usa_desc, R.drawable.usa_flag)
        )
    }
}