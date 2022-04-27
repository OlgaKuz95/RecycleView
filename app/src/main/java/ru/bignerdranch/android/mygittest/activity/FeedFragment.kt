package ru.bignerdranch.android.mygittest.activity


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.bignerdranch.android.mygittest.databinding.FragmentFeedBinding

class FeedFragment : Fragment() {
    override fun onCreateView(
        inflater:LayoutInflater,
        container:ViewGroup?,
        savedInstanseState: Bundle?,
        ): View? {
val binding = FragmentFeedBinding.inflate(inflater,container,false)
        return binding.root
    }

}
