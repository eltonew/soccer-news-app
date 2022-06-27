package my.projetc.soccer_news_projetc.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import my.projetc.soccer_news_projetc.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        news = new MutableLiveData<>();

        //TODO remove mock de noticias
        List<News> news = new  ArrayList<>();

        news.add(new News("Vasco e 777 assinam a SAF em negócio de R$ 1,7 bi",
                "O contrato entre Vasco e 777 Partners está oficialmente assinado. Após a conclusão da formalidade das assinaturas eletrônicas no Brasil e nos EUA, o clube iniciou nesta segunda uma nova fase no processo da venda de 70% da SAF. Na sede da KPMG, no Centro do Rio de Janeiro, a Comissão Especial se reuniu para começar a analisar o contrato vinculante."));

        news.add(new News("Com apoio da torcida no aeroporto, Flamengo embarca para a Colômbia com desfalques",
                "Time tem quatro baixas por Covid-19: Diego Alves, Willian Arão, Matheus Cunha e Fabrício Bruno;"));

        news.add(new News("Lucas Leiva é apresentado no Grêmio e explica desejo de retornar ao clube: \"Não importa onde está\"",
                "Volante retorna ao clube 15 anos após saída para o futebol europeu, ganha a camisa 15 usada na Batalha dos Aflitos e diz que objetivo é ajudar o time a subir para a Série A"));

        this.news.setValue(news);
    }

    public LiveData< List<News> > getNews() { return news; }
}