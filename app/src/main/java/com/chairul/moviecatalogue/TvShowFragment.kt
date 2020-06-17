package com.chairul.moviecatalogue

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.chairul.moviecatalogue.entity.TvShow
import com.chairul.moviecatalogue.viewModel.TvShowViewModel
import kotlinx.android.synthetic.main.fragment_tv_show.*
import kotlinx.android.synthetic.main.item_tv_show.view.*

/**
 * A simple [Fragment] subclass.
 */
class TvShowFragment : Fragment() {
    private lateinit var adapter: TvShowAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvShowViewModel::class.java]
        val tvShows = viewModel.getTvShow()
        adapter= TvShowAdapter()
        adapter.notifyDataSetChanged()
        rvTvShow.layoutManager = GridLayoutManager(context, 2)
        rvTvShow.adapter = adapter
        adapter.setTvShow(tvShows)

    }




    inner class TvShowAdapter: RecyclerView.Adapter<TvShowAdapter.TvShowHolder>() {
        private var listTvShow = ArrayList<TvShow>()

        fun setTvShow(movies: List<TvShow>?) {
            if (movies == null) return
            listTvShow.clear()
            listTvShow.addAll(movies)
            Log.v("ADX","List Adapter "+adapter.listTvShow)
        }

        inner class TvShowHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        }

        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): TvShowHolder {
            val mView = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_tv_show, viewGroup, false)
            return TvShowHolder(mView)
        }


        override fun getItemCount(): Int = listTvShow.size

        override fun onBindViewHolder(moviesViewHolder: TvShowHolder, position: Int) {
            try {
                    moviesViewHolder.itemView.txTitle.text = listTvShow[position].title
                    moviesViewHolder.itemView.txGenre.text = listTvShow[position].genre
                    moviesViewHolder.itemView.txDuration.text = listTvShow[position].duration
                    Glide.with(context!!).load(listTvShow[position].imgPath).into( moviesViewHolder.itemView.imgThumb)
                moviesViewHolder.itemView.setOnClickListener { gotToDetailTvShow(listTvShow[position]) }
            }catch (e: Exception){
                Log.v("ADX","error bind tv $e")
            }

        }
        private fun gotToDetailTvShow(tvShow: TvShow) {
            val intent  = Intent(context, DetailTvShowActivity::class.java)
            intent.putExtra(DetailTvShowActivity.DETAIL_TVSHOW, tvShow.id.toString())
            startActivity(intent)
        }


    }

}
