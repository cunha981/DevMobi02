package br.usjt.deswebmob.meuprimeiroappccp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.EditText;

public class MainActivity extends Activity {

    public static final String MENSAGEM = "br.usjt.deswebmob.meuprimeiroappccp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText = findViewById(R.id.edit_text);
        String mensagem = editText.getText().toString();

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(MENSAGEM,mensagem);
        startActivity(intent);
    }
}
