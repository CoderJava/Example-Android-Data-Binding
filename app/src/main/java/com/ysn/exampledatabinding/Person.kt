package com.ysn.exampledatabinding

import android.databinding.BaseObservable
import android.databinding.Bindable

class Person : BaseObservable() {

    var name = ""
    @Bindable get
    set(value) {
        field = value
        notifyPropertyChanged(BR.name)
    }

}

