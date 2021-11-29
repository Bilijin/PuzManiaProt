package com.mobolajialabi.puzmania

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.fragment.findNavController

class RiddleFragment1 : Fragment() {

    private lateinit var answer: String
    private lateinit var riddle: String
    private var level: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_riddle1, container, false)
        if (arguments != null){
            level = requireArguments().getInt("level")
            riddle = requireArguments().getString("riddle").toString()
            answer = requireArguments().getString("level").toString()
        }
        view.findViewById<TextView>(R.id.riddle).text = riddle

        view.findViewById<Button>(R.id.check_btn).setOnClickListener {
            val ans = view.findViewById<EditText>(R.id.riddle_answer).text.toString()

            if (ans.uppercase() == answer.uppercase()){
                view.findViewById<LinearLayout>(R.id.correct_layout).visibility = View.VISIBLE
            } else{
                Toast.makeText(context, "Your answer is wrong", Toast.LENGTH_SHORT).show()
            }
        }

        view.findViewById<Button>(R.id.next_btn).setOnClickListener {  }
        view.findViewById<Button>(R.id.main_menu_btn).setOnClickListener {
            findNavController().navigate(R.id.action_riddleFragment1_to_riddleLevelSelectFragment)
        }


        return view
    }
}