package com.ysn.exampledatabinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.ysn.exampledatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val TAG = javaClass.simpleName
    lateinit var binding: ActivityMainBinding
    lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        person = Person()
        person.name = "-"
        binding.person = person
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.button -> {
                Log.d(TAG, "button clicked")
                // One way
                /*person.name = "Yudi Setiawan"*/

                // Two way
                binding.textview.text = "Yudi"
                Log.d(TAG, "person.name: ${person.name}")
            }
            else -> {
                /* nothing to do in here */
            }
        }
    }
}
