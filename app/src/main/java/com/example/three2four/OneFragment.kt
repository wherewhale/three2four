package com.example.three2four

import android.os.Bundle
import android.os.Message
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.three2four.Data.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.fragment_one.*

class OneFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        val view2 = inflater.inflate(R.layout.fragment_two, container, false)

        val send = view.findViewById<Button>(R.id.send)
        send.setOnClickListener() {
            sendMessage(requireView())

        }

        return view
    }

    fun sendMessage(view: View) {
        val editText = view.findViewById<EditText>(R.id.stext)
        val message = editText.text.toString()
        EXTRA_MESSAGE = message
    }



}




