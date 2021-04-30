package eu.nexume.asynctaskexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactsAdapter extends ArrayAdapter<ContactsModel> {

    public ContactsAdapter(Context context, List<ContactsModel> contacts) {
        super(context, 0, contacts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ContactsModel currentContact = getItem(position);

        TextView nameView = listItemView.findViewById(R.id.name);
        nameView.setText(currentContact.getName());

        TextView emailView = listItemView.findViewById(R.id.email);
        emailView.setText(currentContact.getEmail());

        TextView mobileView = listItemView.findViewById(R.id.mobile);
        mobileView.setText(currentContact.getMobile());

        TextView addressView = listItemView.findViewById(R.id.address);
        addressView.setText(currentContact.getAddress());

        return listItemView;
    }

}