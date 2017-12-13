package org.sierraguadalupe.mensajitosandroid;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TareaGuardarMensjaes tareaGuardarMensjaes=new TareaGuardarMensjaes();
        tareaGuardarMensjaes.execute(null,null,null);
    }

    public class TareaGuardarMensjaes extends AsyncTask<String, String, String>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {

            super.onPostExecute(s);



        }

        @Override
        protected String doInBackground(String... strings) {


            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
            Mensajito mensajito=new Mensajito();
            mensajito.setCuerpo("EL PUERCO es sabroso en salsa verde ");
            mensajito.setTitulo("adios");
            String resultado = restTemplate.postForObject("https://jc-moguito.herokuapp.com/api/mensajito", mensajito, String.class);

            ObjectMapper mapper=new ObjectMapper();
            try {
                Estatus estatus=mapper.readValue(resultado, Estatus.class);
                System.out.println("ESTATUS DEL SERVICIO: "+estatus.isSuccess());
            } catch (Exception e) {
                System.out.println("ERROR "+e.getMessage());
            }
            return null;
        }
    }
}
