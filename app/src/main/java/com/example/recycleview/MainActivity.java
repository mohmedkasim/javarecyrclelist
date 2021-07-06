package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Mohamed kasim","mk4957454@gmail.com","https://phillipbrande.files.wordpress.com/2013/10/random-pic-14.jpg"));
        contacts.add(new Contact("Anas Ebrahim","Anas@gmail.com","https://phillipbrande.files.wordpress.com/2013/10/random-pic-14.jpg"));
        contacts.add(new Contact("Saleh Ahmed","Saleh123@gmail.com","https://phillipbrande.files.wordpress.com/2013/10/random-pic-14.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
//        contactsRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}