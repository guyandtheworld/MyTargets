/*
 * Copyright (C) 2018 Florian Dreier
 *
 * This file is part of MyTargets.
 *
 * MyTargets is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2
 * as published by the Free Software Foundation.
 *
 * MyTargets is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package de.dreier.mytargets.views.selector

import android.content.Context
import android.util.AttributeSet
import android.view.View
import de.dreier.mytargets.R
import de.dreier.mytargets.databinding.SelectorItemImageDetailsBinding
import de.dreier.mytargets.shared.models.WindSpeed

class WindSpeedSelector @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : SelectorBase<WindSpeed, SelectorItemImageDetailsBinding>(
    context,
    attrs,
    R.layout.selector_item_image_details,
    WIND_SPEED_REQUEST_CODE
) {

    override fun bindView(item: WindSpeed) {
        view.name.text = item.name
        view.image.setImageResource(item.drawable)
        view.title.visibility = View.VISIBLE
        view.title.setText(R.string.wind_speed)
    }

    fun setItemId(speed: Long) {
        setItem(WindSpeed.getList(context)[speed.toInt()])
    }

    companion object {
        const val WIND_SPEED_REQUEST_CODE = 4
    }
}
