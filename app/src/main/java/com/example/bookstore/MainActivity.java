package com.example.bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.bookstore.books.Book;
import com.example.bookstore.books.Book_da;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private EditText edtcat;
private EditText setcat;
private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtcat=findViewById(R.id.edtcat);
        setcat=findViewById(R.id.setcat);
        spinner=findViewById(R.id.spinner);
        fillspinner();
    }

    private void fillspinner() {
        Book_da fill =new Book_da();
        String [] fil= fill.cat();
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this , android.R.layout.simple_spinner_item,fil);
        spinner.setAdapter(adapter);


    }
//////////////////
    public void btnOnClick(View view) {
        String cat =spinner.getSelectedItem().toString();
        String res="";
        Book_da book=new Book_da();
        ArrayList<Book> booklist=new ArrayList<>();
        booklist=book.getbooks(cat);
        for (Book b :booklist){
            res+=b.getTitle() +"\r\n";
        }
        setcat.setText(res);


    }
}