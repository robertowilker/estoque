package kvm.com.br.estoque.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kvm.com.br.estoque.R;
import kvm.com.br.estoque.model.Predio;

public class PredioAdapter extends BaseAdapter {

    private final List<Predio> lista;
    private Context context;

    public PredioAdapter(Context context, List<Predio> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lista.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_predio, parent, false);

        Predio predio = lista.get(position);
        TextView nomeTextView = viewCriada.findViewById(R.id.item_predio_nome);
        nomeTextView.setText(predio.getNome().toString());

        return viewCriada;
    }
}
