package br.com.galdar.legendsofgaldar.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.galdar.legendsofgaldar.R;
import br.com.galdar.legendsofgaldar.models.Being;

public class AdapterChars extends RecyclerView.Adapter<AdapterChars.CharsViewHolder> {

    private List<Being> beingList;

    public AdapterChars(List<Being> beingList) {
        this.beingList = beingList;
    }

    @NonNull
    @Override
    public CharsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View listItem = LayoutInflater.from( parent.getContext() ).inflate(R.layout.adapter_chars_list, parent, false);

        return new CharsViewHolder( listItem );
    }

    @Override
    public void onBindViewHolder(@NonNull CharsViewHolder charsViewHolder, int position) {

        Being being = beingList.get( position );

        charsViewHolder.name.setText( being.getName() );
        charsViewHolder.level.setText( being.getLevel() );
        charsViewHolder.charClass.setText( being.getCharClass() );

    }

    @Override
    public int getItemCount() {
        return beingList.size();
    }

    public class CharsViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView level;
        TextView charClass;

        public CharsViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById( R.id.textCharName );
            level = itemView.findViewById( R.id.textCharLevel );
            charClass = itemView.findViewById( R.id.textCharClass );
        }
    }

}
