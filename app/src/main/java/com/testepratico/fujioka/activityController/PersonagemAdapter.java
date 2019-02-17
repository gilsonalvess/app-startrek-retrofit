package com.testepratico.fujioka.activityController;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.testepratico.fujioka.R;
import com.testepratico.fujioka.model.Personagem;

import java.util.ArrayList;

public class PersonagemAdapter extends BaseAdapter {

    private final ArrayList<Personagem> personagens;
    private final Activity activity;

    public PersonagemAdapter(ArrayList<Personagem> personagens, Activity activity) {
        this.personagens = personagens;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return personagens.size();
    }

    @Override
    public Object getItem(int position) {
        return personagens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = activity.getLayoutInflater()
                .inflate(R.layout.activity_item_personagem, parent, false);

        Personagem personagem = personagens.get(position);
        // TODO adionar atributo imagem
        TextView nome = (TextView) rowView.findViewById(R.id.id_nome_pers);
        TextView funcao = (TextView) rowView.findViewById(R.id.id_funcao);
        TextView frota = (TextView) rowView.findViewById(R.id.id_frota);

        nome.setText(personagem.getNome());
        funcao.setText(personagem.getFuncao());
        frota.setText(personagem.getFrota());

        return rowView;
    }
}