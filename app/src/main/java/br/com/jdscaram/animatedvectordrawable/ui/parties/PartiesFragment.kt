package br.com.jdscaram.animatedvectordrawable.ui.parties

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import br.com.jdscaram.animatedvectordrawable.R

class PartiesFragment : Fragment() {

    private lateinit var partiesViewModel: PartiesViewModel
    lateinit var imageView: ImageView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        partiesViewModel =
                ViewModelProviders.of(this).get(PartiesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_parties, container, false)
        val textView: TextView = root.findViewById(R.id.text_parties)
        imageView = root.findViewById(R.id.image)
        partiesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onResume() {
        super.onResume()
        (imageView.drawable as? AnimatedVectorDrawable)?.apply {
            start()
        }
    }
}