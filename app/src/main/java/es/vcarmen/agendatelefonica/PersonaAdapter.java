package es.vcarmen.agendatelefonica;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by matinal on 17/10/2017.
 */

public class PersonaAdapter extends ArrayAdapter<Persona> {

    public PersonaAdapter(@NonNull Context context, ArrayList<Persona> lista) {
        super(context, 0, lista);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Persona persona = getItem(position);

        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);

        TextView nombre = (TextView) convertView.findViewById(R.id.tvName);
        TextView apellidos = (TextView) convertView.findViewById(R.id.tvSurname);
        TextView email = (TextView) convertView.findViewById(R.id.tvEmail);

        nombre.setText(persona.getNombre());
        apellidos.setText(persona.getApellidos());
        email.setText(persona.getEmail());

        return convertView;
    }


}
