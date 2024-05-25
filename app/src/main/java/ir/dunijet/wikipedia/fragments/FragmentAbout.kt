package ir.dunijet.wikipedia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import ir.dunijet.wikipedia.databinding.FragmentProfileAboutmeBinding

class FragmentAbout : BottomSheetDialogFragment(){
    lateinit var binding: FragmentProfileAboutmeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentProfileAboutmeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}