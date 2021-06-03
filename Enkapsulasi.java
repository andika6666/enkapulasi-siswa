/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class siswa {
    public static void main (String args[]) {
//membuat objek dari class
  Enkapsulasi data = new Enkapsulasi ();
  data.setNama ("andin");
  data.setUmur (19);
  data.setID (1234);
 
  System.out.println ("Nama : "+ data.getNama ());
  System.out.println("Umur  : "+data.getUmur());
  System.out.println("ID    : "+data.getID());
    }
 }


/**
 *
 * @author MOKLET-1
 */
public class Enkapsulasi {
    //deklarasi atribut
private String nama;
private int id;
private int umur;
 //getter
public int getUmur ()
{
return umur;
}
 
public String getNama ()
{
return nama;
}
 
public int getID()
{
return id;
}
//setter
public void setUmur (int umurBaru)
{
umur = umurBaru;
}
public void setNama (String namaBaru)
{
nama = namaBaru;
}
 
public void setID (int idBaru)
{
id = idBaru;
 }

}