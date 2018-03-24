/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import Model.InitModel;

/**
 *
 * @author Mario
 */
public class Agenda {
    
    public Agenda(){}
    
    public ResultSet Day(){
             ArrayList<Object> objs = new ArrayList<>();
            objs.addAll(Arrays.asList());
            ResultSet rs = InitModel.sql.SELECT("Dia", objs);           
            return rs;       
    }
        public ResultSet Week(){
             ArrayList<Object> objs = new ArrayList<>();
            objs.addAll(Arrays.asList());
            ResultSet rs = InitModel.sql.SELECT("Week", objs);           
            return rs;       
    }
             public ResultSet Month(){
             ArrayList<Object> objs = new ArrayList<>();
            objs.addAll(Arrays.asList());
            ResultSet rs = InitModel.sql.SELECT("Month", objs);           
            return rs;       
    }
    
}
