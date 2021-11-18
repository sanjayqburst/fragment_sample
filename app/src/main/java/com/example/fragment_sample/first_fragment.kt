package com.example.fragment_sample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentManager


class FirstFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_first_fragment, container, false)
        val btn:Button=view.findViewById(R.id.fragmentBtn)
        btn.setOnClickListener {
            val fragment=SecondFragment()
            val textData:EditText=view.findViewById(R.id.fragment1text)
            val bundle=Bundle()
            bundle.putString("data",textData.text.toString())
            fragment.arguments=bundle
            requireActivity().supportFragmentManager?.beginTransaction()?.replace(R.id.fragmentContainer,fragment)?.commit()
        }
        // Inflate the layout for this fragment
        return view
    }

}