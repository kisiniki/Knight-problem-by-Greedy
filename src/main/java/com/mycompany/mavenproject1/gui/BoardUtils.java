/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.gui;

import java.util.*;

/**
 *
 * @author kisiniki
 */
class BoardUtils {

    public static final Boolean[] FIRST_COLUMN = initColumn(0);
    public static final Boolean[] SECOND_COLUMN = initColumn(1);
    public static final Boolean[] SEVENTH_COLUMN = initColumn(6);
    public static final Boolean[] EIGHT_COLUMN = initColumn(7);
    
    public static final Boolean[] FIRST_ROW = initRow(0);
    public static final Boolean[] SECOND_ROW = initRow(8);
    public static final Boolean[] THIRD_ROW = initRow(16);
    public static final Boolean[] FOURTH_ROW = initRow(24);
    public static final Boolean[] FIFTH_ROW = initRow(32);
    public static final Boolean[] SIXTH_ROW = initRow(40);
    public static final Boolean[] SEVENTH_ROW = initRow(48);
    public static final Boolean[] EIGHT_ROW = initRow(56);
    
    public static final int NUM_TILES = 64;
    public static final int NUM_TILES_PER_ROW = 8;

    
    private BoardUtils(){
        throw  new RuntimeException("kamu tidak bisa secepat ku!");
    }

    private static Boolean[] initColumn(int columnNumber) {
        final Boolean[] column = new Boolean[NUM_TILES];
        do {            
            column[columnNumber]= true;
            columnNumber += NUM_TILES_PER_ROW;
        } while (columnNumber < NUM_TILES);
        return column;
    }
    
    private static Boolean[] initRow(int rowNumber) {
        final Boolean[] row = new Boolean[NUM_TILES];
        for(int i = 0; i < row.length; i++){
            row[i]=false;
        }
        do {            
            row[rowNumber]=true;
            rowNumber++;
        } while (rowNumber % NUM_TILES_PER_ROW != 0);
        return row;
    }
    
}
