package com.kmsstudio.slogans.data

import com.kmsstudio.slogans.R
import com.kmsstudio.slogans.model.Slogan

class Datasource {
    fun loadSlogans():List<Slogan>{
        return listOf<Slogan>(
            Slogan(R.string.slogan1),
            Slogan(R.string.slogan2),
            Slogan(R.string.slogan3),
            Slogan(R.string.slogan4),
            Slogan(R.string.slogan5),
            Slogan(R.string.slogan6),
            Slogan(R.string.slogan7)
        )

    }
}