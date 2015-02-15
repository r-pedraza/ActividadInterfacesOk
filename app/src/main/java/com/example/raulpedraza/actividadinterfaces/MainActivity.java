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
import android.widget.ListView;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    private static final String TAG =MainActivity.class.getName() ;
    String lista[];
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista= new String[]{"Frame","Relative","Linear vertical","Scrollview","Table","Grid"};

        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


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
                Log.d(TAG,"Opcion 1");
                Intent intent1=new Intent(this,Frame.class);
                startActivity(intent1);

                break;
            }
                case ("Relative"): {
                    Intent intent2=new Intent(this,Relative.class);
                    startActivity(intent2);
                    Log.d(TAG,"Opcion 2");

                    break;
                }
                    case ("Linear vertical"): {
                        Intent intent3=new Intent(this,LinearVertical.class);
                        startActivity(intent3);
                        Log.d(TAG,"Opcion 3");


                        break;
                    }
                        case ("Scrollview"): {
                            Intent intent4=new Intent(this,Scrollview.class);
                            startActivity(intent4);
                            Log.d(TAG,"Opcion 4");


                            break;
                        }
                            case ("Table"): {
                                Intent intent5=new Intent(this,Table.class);
                                startActivity(intent5);
                                Log.d(TAG,"Opcion 5");


                                break;
                            }
                                case ("Grid"): {

                                    Intent intent6=new Intent(this,Grid.class);
                                    startActivity(intent6);
                                    Log.d(TAG,"Opcion 6");


                                    break;
                                }
                                default:
                                    break;
            }

        }

    }



