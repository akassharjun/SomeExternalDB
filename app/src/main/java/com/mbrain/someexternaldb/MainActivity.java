package com.mbrain.someexternaldb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
		databaseAccess.open();
		List<Route> routeList = databaseAccess.getRoutes();
		databaseAccess.close();

		for (Route route : routeList){
			System.out.println("Route Name : " + route.getName());
		}
	}
}
