package com.example.clearcity.ui.global

import android.support.v4.app.Fragment
import com.example.clearcity.ui.main.NewComplaint
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens {
    object NewComplaint : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return NewComplaint()
        }

    }
}