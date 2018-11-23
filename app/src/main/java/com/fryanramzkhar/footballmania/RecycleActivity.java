package com.fryanramzkhar.footballmania;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    // TODO 1 Menegerate butterKnife unutk reyclerview
    @BindView(R.id.my_recycle_view)
    RecyclerView myRecycleView;

    // TODO 2 Membuat variable Array untuk menampung data nama, detail, gambar dari String
    String[] namaClub,detailClub;
    int[] gambarClub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        //TODO 3 Mengisi variable Array dari folder res -> strings,drawable
        namaClub = getResources().getStringArray(R.array.club_name);
        detailClub =  getResources().getStringArray(R.array.club_detail);
        gambarClub = new int[]{R.drawable.img_barca,R.drawable.img_madrid,R.drawable.img_bayern,R.drawable.
        img_city,R.drawable.img_mu,R.drawable.img_chelsea,R.drawable.img_acm,R.drawable.img_arsenal};

        //TODO 4 Membuat Objek adapter dan mengirim data nama, detail, dan gambar ke adapter
        Adapter adapter = new Adapter(RecycleActivity.this, gambarClub, namaClub, detailClub);
        myRecycleView.setHasFixedSize(true);
        myRecycleView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecycleView.setAdapter(adapter);



    }
}
