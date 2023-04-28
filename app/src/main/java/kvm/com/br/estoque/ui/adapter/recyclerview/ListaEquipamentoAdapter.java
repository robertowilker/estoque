package kvm.com.br.estoque.ui.adapter.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import kvm.com.br.estoque.R;
import kvm.com.br.estoque.model.Equipamento;

public class ListaEquipamentoAdapter extends RecyclerView.Adapter {

    private final List<Equipamento> equipamentos;
    private final Context context;

    public ListaEquipamentoAdapter(Context context, List<Equipamento> equipamentos){
        this.context = context;
        this.equipamentos = equipamentos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_equipamento, viewGroup, false);
        return new EquipamentoViewHolder(viewCriada);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int posicao) {
        Equipamento equipamento = equipamentos.get(posicao);

        TextView nomeTextView = viewHolder.itemView.findViewById(R.id.item_equipamento_nome);
        TextView modeloTextView = viewHolder.itemView.findViewById(R.id.item_equipamento_modelo);
        TextView qrCodeTextView = viewHolder.itemView.findViewById(R.id.item_equipamento_qrcode);

        nomeTextView.setText(equipamento.getNome());
        modeloTextView.setText(equipamento.getModelo());
        qrCodeTextView.setText(equipamento.getQrCode());
    }

    @Override
    public int getItemCount() {
        return equipamentos.size();
    }

    class EquipamentoViewHolder extends RecyclerView.ViewHolder{

        public EquipamentoViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}