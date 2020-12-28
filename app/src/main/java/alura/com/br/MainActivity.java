package alura.com.br;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_main));
        List<String> alunos = new ArrayList<>(
                Arrays.asList("Aline", "Rodrigo", "Renato")
        );

        ListView list_view_alunos = findViewById(R.id.activity_main_lista_de_alunos);
        list_view_alunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                alunos
        ));



    }
}
