package com.example.clearcity.mvp.global

import com.arellomobile.mvp.MvpPresenter
import com.arellomobile.mvp.MvpView
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import ru.terrakok.cicerone.Router

abstract class BasePresenter<T : MvpView>(private val router: Router) : MvpPresenter<T>() { //todo спросить у Абдулмуталима

    private val compositeDisposable = CompositeDisposable()

    override fun onDestroy() = compositeDisposable.dispose()

    protected fun Disposable.connect() = compositeDisposable.add(this)

    open fun onBackPressed() = router.exit()
}