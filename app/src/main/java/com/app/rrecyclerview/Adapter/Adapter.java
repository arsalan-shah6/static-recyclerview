package com.app.rrecyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.rrecyclerview.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.holder> {
    Context context;
    List<String> name;
    List<String> semester;
    List<String>fee;
    List<String> slipno;
    List<String> email;

    public Adapter(List<String> name, List<String> semester, List<String>fee,List<String> slipno, List<String> email, Context context) {
        this.context = context;
        this.name = name;
        this.semester = semester;
        this.fee = fee;
        this.slipno = slipno;
        this.email = email;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( context ).inflate( R.layout.row_model,parent,false );
        return new holder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        holder.Name.setText( name.get( position ) );
        holder.Semester.setText( semester.get( position ) );
        holder.Fee.setText( fee.get( position ) );
        holder.Slipno.setText( slipno.get( position ) );
        holder.Email.setText( email.get( position ) );

    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    class holder extends RecyclerView.ViewHolder{
        TextView Name,Semester,Fee,Slipno,Email;
        public holder(@NonNull View itemView) {
            super( itemView );
            Name=itemView.findViewById( R.id.student );
            Semester=itemView.findViewById( R.id.semester );
            Fee=itemView.findViewById( R.id.fee );
            Slipno=itemView.findViewById( R.id.fee_no );
            Email=itemView.findViewById( R.id.email );
        }
    }
}
