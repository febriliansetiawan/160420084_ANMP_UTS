package com.example.a160420084_uts_anmp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a160420084_uts_anmp.R
import com.example.a160420084_uts_anmp.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {
    private lateinit var viewModel:ListViewModel
    private val kostListAdapter = KostListAdapter(arrayListOf())
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(this).get(ListViewModel::class.java)
        viewModel.refresh()
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = kostListAdapter
        observeViewModel()

        refreshLayout.setOnRefreshListener {
            recyclerView.visibility = View.GONE
            txtError.visibility = View.GONE
            progressLoad.visibility = View.VISIBLE
            viewModel.refresh()
            refreshLayout.isRefreshing = false
        }
    }

    private fun observeViewModel() {
        viewModel.kostsLD.observe(viewLifecycleOwner){
            kostListAdapter.updateKostList(it)
        }
        viewModel.kostLoadErrorLD.observe(viewLifecycleOwner) {
            if(it == true) {
                txtError.visibility = View.VISIBLE
            } else {
                txtError.visibility = View.GONE
            }
        }
        viewModel.loadingLD.observe(viewLifecycleOwner){
            if(it == true) {
                recyclerView.visibility = View.GONE
                progressLoad.visibility = View.VISIBLE
            } else {
                recyclerView.visibility = View.VISIBLE
                progressLoad.visibility = View.GONE
            }
        }
    }

}