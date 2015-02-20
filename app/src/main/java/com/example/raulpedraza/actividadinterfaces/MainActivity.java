package com.example.raulpedraza.actividadinterfaces;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    private static final String TAG =MainActivity.class.getName() ;
    String lista[];
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista= new String[]{"Frame","Relative","Linear vertical","Scrollview","Table","Grid"};

        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);
        gridView=(GridView)findViewById(R.id.gridView);
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);
        gridView.setOnItemClickListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {

        String item = lista[position];


        switch (item){
            case ("Frame"): {
                startActivity(new Intent(this,Frame.class));
                Log.d(TAG,"Opcion 1");


                break;
            }
                case ("Relative"): {
                    startActivity(new Intent(this,Relative.class));
                    Log.d(TAG,"Opcion 2");

                    break;
                }
                    case ("Linear vertical"): {
                        startActivity(new Intent(this,LinearVertical.class));
                        Log.d(TAG,"Opcion 3");


                        break;
                    }
                        case ("Scrollview"): {
                            startActivity(new Intent(this,Scrollview.class));
                            Log.d(TAG,"Opcion 4");


                            break;
                        }
                            case ("Table"): {
                                startActivity(new Intent(this,Table.class));
                                Log.d(TAG,"Opcion 5");


                                break;
                            }
                                case ("Grid"): {

                                    startActivity(new Intent(this,Grid.class));
                                    Log.d(TAG,"Opcion 6");

                                    break;
                                }
                                default:
                                    break;
            }

        }

    }



