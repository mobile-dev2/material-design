package com.miranda.dolar.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.miranda.dolar.R
import com.miranda.dolar.models.Company
import kotlinx.android.synthetic.main.company_item.view.*

class CompanyAdapter : RecyclerView.Adapter<CompanyAdapter.CompanyVH>() {


    private var list = ArrayList<Company>()

    fun setCompanyList(list: ArrayList<Company>){
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompanyVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.company_item, parent, false)
        return CompanyVH(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CompanyVH, position: Int) {
        holder.setData(list[position])
    }

    class CompanyVH(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{

        override fun onClick(v: View?) {

        }

        fun setData(company: Company) {
            itemView.txtNameCompany.text = company.name
            itemView.txtBuyPrice.text = company.buy
            itemView.txtSellPrice.text = company.sell
        }

    }
}