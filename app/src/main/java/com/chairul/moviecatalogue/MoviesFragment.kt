package com.chairul.moviecatalogue

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.chairul.moviecatalogue.DetailMovieActivity.Companion.DETAIL_MOVIE
import com.chairul.moviecatalogue.entity.Movie
import com.chairul.moviecatalogue.utils.DataDummy
import com.chairul.moviecatalogue.viewModel.MoviesViewModel
import kotlinx.android.synthetic.main.fragment_movies.*
import kotlinx.android.synthetic.main.item_movies.*
import kotlinx.android.synthetic.main.item_movies.imgThumb
import kotlinx.android.synthetic.main.item_movies.txGenre
import kotlinx.android.synthetic.main.item_movies.txRate
import kotlinx.android.synthetic.main.item_movies.txTitle
import kotlinx.android.synthetic.main.item_movies.view.*

/**
 * A simple [Fragment] subclass.
 */
class MoviesFragment : Fragment() {

    private lateinit var adapter: MoviesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MoviesViewModel::class.java]
        val movies = viewModel.getMovie()
        adapter= MoviesAdapter()
        adapter.notifyDataSetChanged()
//        rvMovies.layoutManager = LinearLayoutManager(context)
        rvMovies.layoutManager = GridLayoutManager(context, 2)
        rvMovies.adapter = adapter
        adapter.setMovies(movies)

    }

    private fun fetchData() {
        val listMovie = DataDummy.generateDummyMovies()
        adapter.setMovies(listMovie)
        Log.v("ADX","List Movie "+listMovie)
    }

    inner class MoviesAdapter: RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {
        private var listMovies = ArrayList<Movie>()

        fun setMovies(movies: List<Movie>?) {
            if (movies == null) return
            listMovies.clear()
            listMovies.addAll(movies)
            Log.v("ADX","List Adapter "+adapter.listMovies)
        }

        inner class MoviesViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
            fun bind(movie: Movie){
                try {
                    with(itemView) {
                        txTitle.text = movie.title
                        txGenre.text = movie.genre
                        txRate.text = movie.rate.toString()
                        Glide.with(context).load(movie.imgPath).into(imgThumb)
                    }

                }catch (e: Exception){
                    Log.v("ADX","error bind $e")
                }
            }
        }

        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MoviesViewHolder {
            val mView = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_movies, viewGroup, false)
            return MoviesViewHolder(mView)
        }


        override fun getItemCount(): Int = listMovies.size

        override fun onBindViewHolder(moviesViewHolder: MoviesViewHolder, position: Int) {
            try {
                    moviesViewHolder.itemView.txTitle.text = listMovies[position].title
                    moviesViewHolder.itemView.txGenre.text = listMovies[position].genre
                    moviesViewHolder.itemView.txRate.text = listMovies[position].rate.toString()
                    Glide.with(context!!).load(listMovies[position].imgPath).into( moviesViewHolder.itemView.imgThumb)

                moviesViewHolder.itemView.setOnClickListener { gotToDetailMovie(listMovies[position]) }

            }catch (e: Exception){
                Log.v("ADX","error bind $e")
            }
        }

        private fun gotToDetailMovie(movie: Movie) {
            val intent  = Intent(context, DetailMovieActivity::class.java)
            intent.putExtra(DETAIL_MOVIE, movie.id.toString())
            startActivity(intent)
        }


    }

}
