package com.dejina.week6assignment.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.dejina.week6assignment.R


class AboutFragment : Fragment() {


    private lateinit var tvwebView: WebView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)
        tvwebView = view.findViewById(R.id.tvwebView)
        tvwebView.settings.javaScriptEnabled = true;
        tvwebView.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url!!);
                return true;
            }
        }
        tvwebView.loadUrl("https://softwarica.edu.np/about-softwarica/")
        return view
    }


}