package com.libraries.android.customcomponents101.ui.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.libraries.android.customcomponents101.databinding.LayoutProfileHeaderBinding

class ProfileHeader @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) :
    ConstraintLayout(context, attrs, defStyleAttr, defStyleRes) {

    val binding: LayoutProfileHeaderBinding =
        LayoutProfileHeaderBinding.inflate(LayoutInflater.from(context), this, true)

}