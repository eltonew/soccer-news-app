package my.projetc.soccer_news_projetc.ui.adapter;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import my.projetc.soccer_news_projetc.databinding.NewsItemBinding;
import my.projetc.soccer_news_projetc.domain.News;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private final List<News> dataNews;

    public NewsAdapter(List<News> dataNews) {
        this.dataNews = dataNews;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        NewsItemBinding binding = NewsItemBinding.inflate(layoutInflater, parent, false);


        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        News news = this.dataNews.get(position);

        holder.binding.txtVTitle.setText(news.getTitle());
        holder.binding.txtVDescription.setText(news.getDescription());

        Picasso.get().load(news.getImage())
                .fit()
                .into( holder.binding.imgVThumbnail );
        holder.binding.btnOpenLink.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);

            intent.setData( Uri.parse( news.getLink() ) );
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() { return this.dataNews.size(); }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final NewsItemBinding binding;

        public ViewHolder(NewsItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


}
