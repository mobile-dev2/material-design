package com.miranda.dolar.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.miranda.dolar.R
import com.miranda.dolar.adapters.CompanyAdapter
import com.miranda.dolar.models.Company
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    private lateinit var companyAdapter: CompanyAdapter

    var list = ArrayList<Company>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
       // val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(this, Observer {
          //  textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list.add(Company("Apple......................................-----------------------------------------------------------------------------", "17.50", "18.90"))
        list.add(Company("Facebook", "17.50", "18.90"))
        list.add(Company("Coca-Cola", "17.50", "18.90"))
        list.add(Company("Banco Azteca", "17.50", "18.90"))
        list.add(Company("BBVA", "17.50", "18.90"))
        list.add(Company("Microsoft", "17.50", "18.90"))

        list.add(Company("Apple......................................-----------------------------------------------------------------------------", "17.50", "18.90"))
        list.add(Company("Facebook", "17.50", "18.90"))
        list.add(Company("Coca-Cola", "17.50", "18.90"))
        list.add(Company("Banco Azteca", "17.50", "18.90"))
        list.add(Company("BBVA", "17.50", "18.90"))
        list.add(Company("Microsoft", "17.50", "18.90"))

        companyAdapter = CompanyAdapter()
        view.rcvCompany.layoutManager = LinearLayoutManager(activity)
        view.rcvCompany.adapter = companyAdapter

        companyAdapter.setCompanyList(list)
    }
}