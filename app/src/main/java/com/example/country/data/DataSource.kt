package com.example.country.data



import com.example.country.R
import com.example.country.model.Country

class DataSource {
    fun loadCountries(): List<Country> {
        return listOf(
            // Remplace par les noms de tes images dans res/drawable
            Country(R.string.Finlande, R.string.Helsinki, R.string.FIN, R.drawable.finland_flag),
            Country(R.string.Irlande, R.string.Dublin, R.string.IRL, R.drawable.ireland_flag),
            Country(R.string.Islande, R.string.Reykjavik, R.string.ISL, R.drawable.iceland_flag),
            Country(R.string.Mexique, R.string.Mexico, R.string.MEX, R.drawable.mexico_flag),
            Country(R.string.Nigeria, R.string.Abuja, R.string.NGA, R.drawable.nigeria_flag),
            Country(R.string.Norvege, R.string.Oslo, R.string.NOR, R.drawable.norway_flag),
            Country(R.string.NouvelleZelande, R.string.Wellington, R.string.NZL, R.drawable.newzealand_flag),
            Country(R.string.RDCongo, R.string.Kinshasa, R.string.COD, R.drawable.drc_flag),
            Country(R.string.RSudAfricaine, R.string.Pretoria, R.string.ZAF, R.drawable.zar_flag),
            Country(R.string.EtatsUnis, R.string.Washington, R.string.USA, R.drawable.usa_flag)

        )
    }
}