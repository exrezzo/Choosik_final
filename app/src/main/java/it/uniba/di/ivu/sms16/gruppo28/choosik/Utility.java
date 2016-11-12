package it.uniba.di.ivu.sms16.gruppo28.choosik;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.text.Normalizer;


/**
 * Created by Giorgio on 10/11/2016.
 */

public class Utility {

    public void inserisciFragment(Fragment frag, FragmentManager manager){
        manager.beginTransaction().replace(R.id.relativelayoutforfragment,frag,frag.getTag())
                .addToBackStack(frag.getTag()).commit();
    }



    public String controlloInserimento(String str){
        String allRemoved = str.replaceAll("^\\s+|\\s+$", "");
        str=allRemoved;

       allRemoved = Normalizer.normalize(allRemoved, Normalizer.Form.NFD);
        allRemoved = allRemoved.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        str=allRemoved;


        return str;
        }

    }

