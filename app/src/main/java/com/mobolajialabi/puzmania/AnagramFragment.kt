package com.mobolajialabi.puzmania

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class AnagramFragment : Fragment(), View.OnClickListener {
    private var word = ""
    private lateinit var txt: TextView
    private lateinit var t1: TextView
    private lateinit var t2: TextView
    private lateinit var t3: TextView
    private lateinit var t4: TextView
    private lateinit var t5: TextView
    private var found = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_anagram, container, false)
        txt = view.findViewById(R.id.word_in_p)

        setContentView(view)

        return view
    }

    private fun setContentView(v: View) {
        v.findViewById<Button>(R.id.S).setOnClickListener(this)
        v.findViewById<Button>(R.id.W).setOnClickListener(this)
        v.findViewById<Button>(R.id.A).setOnClickListener(this)
        v.findViewById<Button>(R.id.T).setOnClickListener(this)

        t1 = v.findViewById(R.id.word1)
        t2 = v.findViewById(R.id.word2)
        t3 = v.findViewById(R.id.word3)
        t4 = v.findViewById(R.id.word4)
        t5 = v.findViewById(R.id.word5)
    }

    override fun onClick(p0: View?) {
        when (view?.id) {
            R.id.S -> checkWord("s")
            R.id.W -> checkWord("w")
            R.id.A -> checkWord("a")
            R.id.T -> checkWord("t")
        }
    }

    private fun checkWord(cha: String) {
        txt.text = txt.text.toString() + cha

        val t = txt.text.toString()
        if (t.length == 3) {
            when (t) {
                "WATS" -> {
                    if (t1.visibility == View.VISIBLE) {
                        txt.text = ""
                        Toast.makeText(
                            context,
                            "You've already entered this word",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        t1.visibility = View.VISIBLE
                        found++
                        txt.text = ""
                    }
                }
                ("WAST") -> {
                    if (t2.visibility == View.VISIBLE) {
                        txt.text = ""
                        Toast.makeText(
                            context,
                            "You've already entered this word",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        t2.visibility = View.VISIBLE
                        found++
                        txt.text = ""
                    }
                }
                ("TWAS") -> {
                    if (t3.visibility == View.VISIBLE) {
                        txt.text = ""
                        Toast.makeText(
                            context,
                            "You've already entered this word",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        t3.visibility = View.VISIBLE
                        found++
                        txt.text = ""
                    }
                }
                ("STAW") -> {
                    if (t4.visibility == View.VISIBLE) {
                        txt.text = ""
                        Toast.makeText(
                            context,
                            "You've already entered this word",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        t4.visibility = View.VISIBLE
                        found++
                        txt.text = ""
                    }
                }
                ("TAWS") -> {
                    if (t5.visibility == View.VISIBLE) {
                        txt.text = ""
                        Toast.makeText(
                            context,
                            "You've already entered this word",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        t5.visibility = View.VISIBLE
                        found++
                        txt.text = ""
                    }
                }
                else -> {
                    Toast.makeText(
                        context,
                        "That is not a valid word! Try again",
                        Toast.LENGTH_SHORT
                    ).show()
                    txt.text = ""
                }
            }
        }

        if (found == 7) {
            val toast  = Toast.makeText(context, "Yayy! You found all the anagrams. Congratulation!", Toast.LENGTH_LONG).show()
        }
    }
}