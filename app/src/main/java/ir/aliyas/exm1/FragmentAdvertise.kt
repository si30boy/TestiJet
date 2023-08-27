package ir.aliyas.exm1

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.aliyas.exm1.databinding.FragmentAdvertiseBinding


class FragmentAdvertise : Fragment() {
    lateinit var binding: FragmentAdvertiseBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAdvertiseBinding.inflate(layoutInflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnCloseAd.setOnClickListener {





        }








    }




}
