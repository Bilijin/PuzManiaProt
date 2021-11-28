package com.mobolajialabi.puzmania

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class RiddleFragment1 : Fragment() {

    private val answer: String = "g"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_riddle1, container, false)
        view.findViewById<Button>(R.id.check_btn).setOnClickListener {
            val ans = view.findViewById<EditText>(R.id.riddle_answer).text.toString()

            if (ans.uppercase() == answer.uppercase()){
                view.findViewById<LinearLayout>(R.id.correct_layout).visibility = View.VISIBLE
            } else{
                Toast.makeText(context, "Your answer is wrong", Toast.LENGTH_SHORT).show()
            }
        }

        view.findViewById<Button>(R.id.next_btn).setOnClickListener {  }
        view.findViewById<Button>(R.id.main_menu_btn).setOnClickListener {  }


        return view
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RiddleFragment1().apply {
                arguments = Bundle().apply {
                }
            }
    }
}