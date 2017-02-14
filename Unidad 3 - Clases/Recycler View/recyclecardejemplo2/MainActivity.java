package mx.edu.utng.recyclecardejemplo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView reciclador;
    private RecyclerView.LayoutManager lmanager;
    private RecyclerView.Adapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ClsProducto> datos = new ArrayList<ClsProducto>();
        datos.add(new ClsProducto(R.drawable.a, "Akame Ga Kill", "1 Temporada" +
                "\n"+"Night Raid, un grupo de asesinos destinados a terminar con la corrupción " +
                "del reino."));
        datos.add(new ClsProducto(R.drawable.b, "Fairy Tail", "2 Temporada" +
                "\n"+"Un gremio de magos con la misión de encontrar a Igneel, El Dargón Rey del " +
                "Fuego."));
        datos.add(new ClsProducto(R.drawable.c, "Gate", "1 Temporada, el portal hacia un mundo" +
                "\n"+ "paralelo que se encuentra en la edad media. Con la tecnología del año 2015 del " +
                "mundo humano ¿Qué pasará cuando estas dos civilizaciones se encuentren una con " +
                "la otra?"));
        datos.add(new ClsProducto(R.drawable.d, "Monogatari Series", "Hiraragi " +"\n"+
                "Arata, un ser humano transoformado en un vampiro viviendo en plano siglo 21"));
        datos.add(new ClsProducto(R.drawable.f, "Nanatsu no Tanzai", "1 Temporada"+ "\n"+
                "Los 7 Pecados Capitales, una orden de caballeros del reino que son acusados por " +
                "traición. Sin embargo las cosas no son como todos lo cuentan"));
        datos.add(new ClsProducto(R.drawable.g, "Sword Art Online", "1 Temporada"+"\n"+
                "SAO, un juego que te no te permitirá salir."));


        reciclador = (RecyclerView) findViewById(R.id.reciclador);
        lmanager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        reciclador.setLayoutManager(lmanager);

        adaptador = new ProductoAdaptador(datos);
        reciclador.setAdapter(adaptador);
    }
}
