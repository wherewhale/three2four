package com.example.three2four

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentResultListener
import com.example.three2four.Data.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.fragment_two.*


class TwoFragment : Fragment() {

    companion object {
        const val KEY = "key"
        fun newInstance(data: String) = TwoFragment().apply {
            arguments = Bundle().apply {
                putString(KEY, data)
            }
        }
    }

    val receiveData by lazy { requireArguments().getString(KEY) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_two, container, false)

        val receive = view.findViewById<TextView>(R.id.receive)

        return if (EXTRA_MESSAGE == null) {
            view
        } else {
            val rrr: String? = receiveData.toString()
            Log.d("data : ", receiveData.toString())
            receive.text = rrr
            view
        }


    }


}
