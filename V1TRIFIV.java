/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

/**
 *
 * @author vg739
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class V1TRIFIU 
{
    public static void main(String[] args) throws IOExeception {
        //Declaracion de variantes
    int numero;
    int mult3;
    int mult5;
    BufferedReader bufEntrada=new BufferedReader(new InputStreamReader(System.in));
    //Entrada de datos
    System.out.println("Hola Mundo");
    numero=Integer.parseInt(bufEntrada.readLine());
    //Procesamiento de datos 
    mult3 = numero%3;
    mult5 = numero%5;
    //Salida de Datos
    if(mult3==0)
    {
        System.out.println("TRI");
    }
    if(mult5==0)
    {
        System.out.println("FIV");
    }
    if(mult3==0&&mult5==0 )
    {
        System.out.println("TRIFIV");
        }
    
    }
    /**
        // TODO code application logic here
    
    

