package com.mobolajialabi.puzmania

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class RiddleLevelSelectFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_riddle_level_select, container, false)

        return view
    }

    override fun onClick(p0: View?) {
        var ans: String
        var rid: String
        var no: Int
        if (p0 != null) {
            when (p0.id) {
                R.id.lvl1 ->{
                    rid = getString(R.string.riddle_1)
                    ans = getString(R.string.rid_answer_1)
                    no = 1
                }

                else ->{
                    rid = getString(R.string.riddle_1)
                    ans = getString(R.string.rid_answer_1)
                    no = 1
                }
            }

            if(rid != null && ans != null){

                val bundle = Bundle()
                bundle.putString("riddle", rid)
                bundle.putString("answer", ans)
                bundle.putInt("level", 1)
                findNavController().navigate(R.id.action_riddleLevelSelectFragment_to_riddleFragment1, bundle)
            }


        }
    }
}