package fr.be2.gsb;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.OnNewIntentProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
    public void click_menu(View v){
        //String MSG = "";
        switch(v.getId()){
            case R.id.main_button_faf:
                //MSG ="bouton frais au forfait";
                intent = new Intent(MainActivity.this, frais_au_forfait.class);
                break;
            case R.id.main_button_fhf:
                //MSG = "Bouton frais hors forfait";
                intent = new Intent(MainActivity.this, fraishorsforfait.class);
                break;
            case R.id.main_button_parametres:
                //MSG = "Bouton consulter les frais";
                intent = new Intent(MainActivity.this, parametre.class);
                break;
            case R.id.main_button_fenv:
                //MSG = "Paramétre";
                intent = new Intent(MainActivity.this, consulterlesfrais.class);
                break;
            case R.id.button_codeVisiteur:
                intent = new Intent(MainActivity.this, codeVisiteur.class);

        }startActivity(intent);
        //Toast.makeText(this, MSG, Toast.LENGTH_SHORT).show();
    }
    public void closeActivity(View v){
        this.finish();
    }


    public void envoicode(View view) {
    }

    public void boncode(View view) {
    }
}