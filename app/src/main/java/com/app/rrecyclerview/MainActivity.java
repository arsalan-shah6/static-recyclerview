package com.app.rrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.app.rrecyclerview.Adapter.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<String> studentname;
    List<String> studentSenester;
    List<String> studrntFee;
    List<String >student_slip_no;
    List<String>studentemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        recyclerView=findViewById( R.id.rc );
        studentname=new ArrayList<>();
        studentSenester=new ArrayList<>();
        studrntFee=new ArrayList<>();
       student_slip_no=new ArrayList<>();
        studentemail=new ArrayList<>();

        studentname.add( "Arsalan Shah" );
        studentname.add( "Salman Shah" );
        studentname.add( "Munib ul Haq" );
        studentname.add( "Zain Ullah" );
        studentname.add( "Abu Bakar" );

        studentSenester.add( "8th" );
        studentSenester.add( "3th" );
        studentSenester.add( "8th" );
        studentSenester.add( "8th" );
        studentSenester.add( "7th" );

        studrntFee.add( "26000" );
        studrntFee.add( "36000" );
        studrntFee.add( "26300" );
        studrntFee.add( "46000" );
        studrntFee.add( "46000" );

       student_slip_no.add( "100282" );
        student_slip_no.add( "534267" );
        student_slip_no.add( "678555" );
        student_slip_no.add( "980745" );
        student_slip_no.add( "893643" );

        studentemail.add( "axlnshah@gmail.com" );
        studentemail.add( "salmanshah@gmail.com" );
        studentemail.add( "munib@gmail.com" );
        studentemail.add( "zainuop@gmail.com" );
        studentemail.add( "abubakar@gmail.com" );

        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        Adapter adapter=new Adapter( studentname,studentSenester, student_slip_no,studrntFee,studentemail,this);
        recyclerView.setAdapter( adapter );






    }
}