package com.example.goforest

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.provider.FontsContractCompat.FontRequestCallback.RESULT_OK
import androidx.navigation.Navigation
import com.example.goforest.databinding.ActivityForestBinding
import com.example.goforest.databinding.FragmentHomeBinding
import com.example.goforest.databinding.FragmentStandingBinding


class HomeFragment : Fragment() {
    lateinit var binding:FragmentHomeBinding
    lateinit var binding1:ActivityForestBinding
    val request_video=100
    val request_video2=200
    val request_video3=300
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentHomeBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        FragmentHomeBinding.bind(view)
        binding.btnActivity.setOnClickListener {
            binding.btnAgriculture.visibility = View.VISIBLE
            binding.btnFertilization.visibility = View.VISIBLE
            binding.btnIrrigation.visibility = View.VISIBLE

        }
        binding.btnFertilization.setOnClickListener {
            val intent=Intent(MediaStore.ACTION_VIDEO_CAPTURE)
            try {
                startActivityForResult(intent,request_video3)
            }catch (e:ActivityNotFoundException)
            {
                Toast.makeText(activity, "Try again ):", Toast.LENGTH_LONG).show()
            }

           // Toast.makeText(activity,"Great job (:", Toast.LENGTH_LONG).show()
            //Toast.makeText(activity,"you got 100 coins",Toast.LENGTH_LONG).show()
           //binding1.tvCoins.text=(binding1.tvCoins.text.toString().toInt()+100).toString()

        }
        binding.btnAgriculture.setOnClickListener {
            val intent=Intent(MediaStore.ACTION_VIDEO_CAPTURE)
            try {
                startActivityForResult(intent,request_video)
                   }catch (e:ActivityNotFoundException)
            {
                Toast.makeText(activity, "Try again ):", Toast.LENGTH_LONG).show()
            }

        }
        binding.btnIrrigation.setOnClickListener {
            val intent=Intent(MediaStore.ACTION_VIDEO_CAPTURE)
            try {
                startActivityForResult(intent,request_video2)
                 }catch (e:ActivityNotFoundException)
            {
                Toast.makeText(activity, "Try again ):", Toast.LENGTH_LONG).show()
            }

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode==request_video)
        {
              Toast.makeText(activity, "Great job (:", Toast.LENGTH_LONG).show()
            Toast.makeText(activity, "you got 200 coins", Toast.LENGTH_LONG).show()
            // binding1.tvCoins.text = (binding1.tvCoins.text.toString().toInt() + 200).toString()

        }
        else if(requestCode==request_video2)
        {
            Toast.makeText(activity,"Great job (:", Toast.LENGTH_LONG).show()
            Toast.makeText(activity,"you got 50 coins",Toast.LENGTH_LONG).show()
            //binding1.tvCoins.text=(binding1.tvCoins.text.toString().toInt()+50).toString()
        }
        else if(requestCode==request_video3)
        {
             Toast.makeText(activity,"Great job (:", Toast.LENGTH_LONG).show()
            Toast.makeText(activity,"you got 50 coins",Toast.LENGTH_LONG).show()
            //binding1.tvCoins.text=(binding1.tvCoins.text.toString().toInt()+50).toString()
        }
    }

}