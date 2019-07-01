package com.example.clearcity.mvp.main.main

import com.arellomobile.mvp.InjectViewState
import com.example.clearcity.mvp.global.BasePresenter
import com.example.clearcity.ui.global.Screens
import ru.terrakok.cicerone.Router

@InjectViewState
class MainPresenter(private val router: Router) : BasePresenter<MainView>(router) {

    override fun onFirstViewAttach() {
        router.newRootChain(Screens.NewComplaint)
    }
}